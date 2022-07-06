package furama_project_101.controller;

import furama_project_101.services.impl.IServicesCustomerImpl;

import java.util.Scanner;

public class CustomerManagement {
    public static void displayCustomerManagement() {
        Scanner scanner = new Scanner(System.in);
        String num;
        IServicesCustomerImpl iServicesCustomer= new IServicesCustomerImpl();

        do {
            System.out.println("______Customer Management______");
            System.out.println(
                    "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tRemove customer\n" +
                            "5.\tReturn main menu\n");
            System.out.println("Please enter your choice");
             num = scanner.nextLine();
            switch (num) {
                case "1":iServicesCustomer.display();
                    break;
                case "2":iServicesCustomer.add();
                    break;
                case "3":iServicesCustomer.edit();
                    break;
                case "4":iServicesCustomer.remove();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (!num.equals("5"));
    }
}

