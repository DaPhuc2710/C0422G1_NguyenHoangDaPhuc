package furama_project.controller1;

import java.util.Scanner;

public class PromotionManagement {
    public static void displayPromotionManagement(){
        boolean flag= true;
        System.out.println("Customer Management" +
                "\n1.\tDisplay list customers use service" +
                "\n2.\tDisplay list customers get voucher" +
                "\n3.\tReturn main menu");
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
                default:
                    System.out.println("Please enter again");
                    break;
            }
        } while (flag);
    }
}
