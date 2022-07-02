package furama_project_101.controller;


import furama_project_101.services.impl.IServicesEmployeeImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayEmployeeManagement() {
        IServicesEmployeeImpl iServicesEmployee = new IServicesEmployeeImpl();
        Scanner scanner = new Scanner(System.in);
        String num;

        do {
            System.out.println("______Employee Management______");
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4\tReturn main menu");
            System.out.println("Please enter your choice");
            num = scanner.nextLine();
            switch (num) {
                case "1":iServicesEmployee.display();
                    break;
                case "2":
                    iServicesEmployee.add();
                    break;
                case "3":iServicesEmployee.edit();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (!num.equals("4"));
    }
}
