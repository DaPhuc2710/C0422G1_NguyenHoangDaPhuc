package furama_project_101.controller;

import java.util.Scanner;

public class FacilityManagement {
    public static void displayFacilityManagement() {
        Scanner scanner = new Scanner(System.in);
        String num;
        do {
            System.out.println("______Facility Management______");
            System.out.println(
                    "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
            System.out.println("Please enter your choice");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again");

            }
        } while (!num.equals("4"));
    }
}
