package ss6_inheritance.bai_tap.point_and_movable_point;
import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x");
        float x=Float.parseFloat(scanner.nextLine());
        System.out.println("Enter y");
        float y=Float.parseFloat(scanner.nextLine());
        Point point=new Point();
        point.setXY(x,y);
        System.out.println(Arrays.toString(point.getXY()));

    }
}
