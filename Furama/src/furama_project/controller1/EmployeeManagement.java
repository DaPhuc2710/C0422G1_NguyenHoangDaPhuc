package furama_project.controller1;
import furama_project.services.impl.EmployeeServicesImpl;

import java.util.Scanner;

public class EmployeeManagement {
    static EmployeeServicesImpl employeeServices = new EmployeeServicesImpl();

    public static void displayEmployeeManagement() {
//        boolean runEmployee = true;
           String choose;
        do {
            System.out.println("Employee Management" +
                    "\n1.\tDisplay list employees" +
                    "\n2.\tAdd new employee" +
                    "\n3.\tEdit employee" +
                    "\n4.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number you want");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    employeeServices.display();
                    break;
                case "2":
                    employeeServices.add();
                    break;
                case "3":
                    employeeServices.edit();
                    break;
                case "4":
                    break;
            }
        } while (!choose.equals("4"));
    }
}
