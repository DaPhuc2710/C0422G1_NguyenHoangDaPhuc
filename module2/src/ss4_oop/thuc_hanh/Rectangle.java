package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double height, width;

    public Rectangle(double heigth, double width) {
        this.height = heigth;
        this.width = width;
    }

    public double GetArea() {
        return this.width * this.height;
    }

    public double GetPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String Display() {
        return "This rectangle{" + "width=" + width + "heigth=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Your rectangle is" + rectangle.Display());
        System.out.println("Perimeter of rectangle is:\t" + rectangle.GetPerimeter());
        System.out.println("Area of rectangle is:\t" + rectangle.GetArea());
    }
}

