package furama_project.controller1;

import java.util.Scanner;

// để tuần gần thi làm
public class BookingManagement {
    public static void displayBookingManagement() {
        boolean fBooking = true;
        System.out.println("Booking Management" +
                "\n1.\t Add new booking" +
                "\n2.\t Display list booking" +
                "\n3.\t Create new contracts" +
                "\n4.\t Display list contracts" +
                "\n5.\t Edit contracts" +
                "\n6.\t Return main menu");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want");
        String choose = scanner.nextLine();
        do {
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Please enter again");
                    break;
            }
        } while (fBooking);
    }
}
