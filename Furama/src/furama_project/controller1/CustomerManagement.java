package furama_project.controller1;

import furama_project.services.impl.CustomerServicesImpl;

import java.util.Scanner;

public class CustomerManagement {
    static CustomerServicesImpl customerServices = new CustomerServicesImpl();

    public static void displayCustomerManagement() {
        boolean RunCustomer = true;
        System.out.println("Customer Management" +
                "\n1.\tDisplay list customers" +
                "\n2.\tAdd new customer" +
                "\n3.\tEdit customer" +
                "\n4.\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want");
        String choose = scanner.nextLine();
        do {
            switch (choose) {
                case "1":
                    customerServices.display();
                    break;
                case "2":
                    customerServices.add();
                    break;
                case "3":
                    customerServices.edit();
                    break;
                case "4":
                    RunCustomer = false;
                    break;
            }
        } while (RunCustomer);
    }
}
