package furama_project.controller1;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean runController = true;
        System.out.println("Furama Resort Management" +
                "\n1.\tEmployee Management" +
                "\n2.\tCustomer Management" +
                "\n3.\tFacility Management" +
                "\n4.\tBooking Management" +
                "\n5.\tPromotion Management" +
                "\n6.\tExit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want");
        String choose = scanner.nextLine();
        do {
            switch (choose) {
                case "1":
                    EmployeeManagement.displayEmployeeManagement();
                    break;
                case "2":
                    CustomerManagement.displayCustomerManagement();
                    break;
                case "3":
                    FacilityManagement.displayFacilityManagement();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":runController = false;
                    break;
            }
        } while (runController);

    }
}
