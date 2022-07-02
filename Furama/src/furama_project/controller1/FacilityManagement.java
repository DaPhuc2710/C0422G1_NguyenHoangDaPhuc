package furama_project.controller1;

import java.util.Scanner;

public class FacilityManagement {
    public static void displayFacilityManagement() {
        boolean flag = true;
        System.out.println("FacilityManagement" +
                "\n1.\tDisplay list facility" +
                "\n2.\tAdd new facility" +
                "\n3.\tEdit facility" +
                "\n4.\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = scanner.nextLine();
        do {
            switch (number) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        } while (flag);
    }
}
