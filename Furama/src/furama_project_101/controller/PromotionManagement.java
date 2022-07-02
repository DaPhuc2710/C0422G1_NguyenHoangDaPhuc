package furama_project_101.controller;

import java.util.Scanner;

public class PromotionManagement {
    public static void displayPromotionManagement() {
        Scanner scanner = new Scanner(System.in);
        String num;
        do {
            System.out.println("______Promotion Management______");
            System.out.println(
                    "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            System.out.println("Please enter your choice");
             num = scanner.nextLine();
            switch (num) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Please enter again");
            }
        } while (!num.equals("3"));
    }
}
