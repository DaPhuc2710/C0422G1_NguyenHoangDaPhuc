package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        double rate=23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter USD");
        usd =scanner.nextDouble();
        double vnd=usd*rate;
        System.out.println("To VND:"+vnd);
    }
}
