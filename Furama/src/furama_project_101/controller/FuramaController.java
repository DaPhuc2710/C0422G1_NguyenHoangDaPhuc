package furama_project_101.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        String num;
        while (true) {
            System.out.println("______Main Menu______");
            System.out.println(
                    "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n" +
                            "\n");
            System.out.println("Please enter your choice");
            num = scanner.nextLine();
            switch (num) {
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
                    BookingManagement.displayBookingManagement();
                    break;
                case "5":
                    PromotionManagement.displayPromotionManagement();
                    break;
                case "6":
                    System.exit(6); // dùng để dừng ctrinh
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        }


    }
}
