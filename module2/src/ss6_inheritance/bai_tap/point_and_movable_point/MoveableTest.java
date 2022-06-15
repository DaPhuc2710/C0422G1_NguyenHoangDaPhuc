package ss6_inheritance.bai_tap.point_and_movable_point;

public class MoveableTest {
    public static void main(String[] args) {
       MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint.move());
        MoveablePoint moveablePoint1=new MoveablePoint(5.7f,7.4f,12.6f,5.0f);

        System.out.println(moveablePoint1.move());
    }
}
