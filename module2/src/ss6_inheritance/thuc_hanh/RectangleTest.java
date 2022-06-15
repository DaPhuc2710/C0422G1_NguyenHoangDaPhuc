package ss6_inheritance.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(2.3, 5.7);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(4.4, 3.1, "blueOcean", false);
        System.out.println(rectangle2);
    }
}
