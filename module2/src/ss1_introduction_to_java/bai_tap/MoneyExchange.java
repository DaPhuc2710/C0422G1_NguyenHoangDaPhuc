package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter USD");
        usd =scanner.nextDouble();
        double exchange=usd*vnd;
        System.out.println("To VND:"+exchange);
    }
}
