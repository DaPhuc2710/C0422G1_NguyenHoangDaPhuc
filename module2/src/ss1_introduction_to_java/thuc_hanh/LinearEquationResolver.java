package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation as'a*x+b=c' please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x=%f!",answer); //printf định dạng cho phầm trăm // %f!
        }else {
            if (b==c){
                System.out.println("the solution is all x!");
            } else {
                System.out.println("No slolution!");
            }
    }
}
}
