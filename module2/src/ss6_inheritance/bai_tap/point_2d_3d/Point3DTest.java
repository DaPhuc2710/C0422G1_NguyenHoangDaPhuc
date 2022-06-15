package ss6_inheritance.bai_tap.point_2d_3d;

import java.util.Arrays;
import java.util.Scanner;

public class Point3DTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x");
        float x=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter y");
        float y=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter z");
        float z=Float.parseFloat(scanner.nextLine());
        Point3D point3D=new Point3D();
        point3D.setXYZ(x,y,z);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
