package ss7_abstract_interface.thuc_hanh.comperator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle();
        circles[1] = new Circle(5.0, "Red Tornado", false);
        circles[2] = new Circle(3.3, "Black Knight", true);
        circles[3] = new Circle(3.3, "Black Knight", false);

        System.out.println("Before");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After sort");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
