package ss7_abstract_interface.bai_tap.resizeable_for_geometries;


public class TestResizeable {
    public static void main(String[] args) {
        Shapes[] shapes=new Shapes[3];
        shapes[0]= new Circle(4.0);
        shapes[1]= new Rectangle(3,4);
        shapes[2]= new Square(3);
        System.out.println("Before changing");
        for (Shapes s:shapes) {
            System.out.println(s);
        }
            for (Shapes s: shapes
                 ) {
                if (s instanceof Circle) {
                    ((Circle)s).resize(20);
            } else if (s instanceof Rectangle) {
                    ((Rectangle)s).resize(50);
                } else {
                    ((Square)s).resize(10);
                }

            }
        System.out.println("After changing");
        for (Shapes s:shapes
             ) {
            System.out.println(s);
        }

        }

    }

