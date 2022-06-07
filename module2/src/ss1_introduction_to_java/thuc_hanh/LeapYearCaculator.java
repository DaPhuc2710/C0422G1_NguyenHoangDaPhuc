package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCaculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year=scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("%d is a leap year");// định dạng của %d : integer (incl. byte, short, int, long, bigint)
                }else {
                    System.out.println("%d is not a leap year");
                }
            }else {
                System.out.println("%d is a leap year");
            }
        }else {
            System.out.println("%d is not a leap year");
        }
    }
}
