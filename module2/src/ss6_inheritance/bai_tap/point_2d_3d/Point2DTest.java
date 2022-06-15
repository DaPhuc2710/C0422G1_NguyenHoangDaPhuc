package ss6_inheritance.bai_tap.point_2d_3d;

import java.util.Arrays;
import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x");
        float x=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter y");
        float y=Float.parseFloat(scanner.nextLine());
        Point2D point2D=new Point2D();
        point2D.setXY(x,y);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
