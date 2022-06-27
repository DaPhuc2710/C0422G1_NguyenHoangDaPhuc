package ss14_exception.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Nhập biểu thức (a*x+b=0), vui lòng nhập biến");
        System.out.println(" Nhập a");
        double a= scanner.nextDouble();
        System.out.println("Nhập b");
        double b= scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
