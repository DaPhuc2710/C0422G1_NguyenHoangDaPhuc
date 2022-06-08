package ss2_loop_statement.thuc_hanh;

import java.util.Scanner;

public class InterestCaculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money");
        money = input.nextDouble();
        System.out.println("Enter months");
        month = input.nextInt();
        System.out.println("Enter interest rate");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total interest"+totalInterest);
    }
}
