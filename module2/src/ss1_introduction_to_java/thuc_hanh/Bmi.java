package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kg):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meters):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20s%s", bmi, "Underweight");
        } else if (bmi < 25.00) {
            System.out.printf("%-20s%s", bmi, "Normal");
        } else if (bmi < 30.00) {
            System.out.printf("%-20s%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20s%s", bmi,"Obese");
        }
    }
}

