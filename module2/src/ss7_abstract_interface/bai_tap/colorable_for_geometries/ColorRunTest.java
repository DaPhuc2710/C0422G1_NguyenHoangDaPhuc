package ss7_abstract_interface.bai_tap.colorable_for_geometries;

import ss7_abstract_interface.bai_tap.resizeable_for_geometries.Circle;
import ss7_abstract_interface.bai_tap.resizeable_for_geometries.Rectangle;
import ss7_abstract_interface.bai_tap.resizeable_for_geometries.Shapes;
import ss7_abstract_interface.bai_tap.resizeable_for_geometries.Square;

public class ColorRunTest {
    public static void main(String[] args) {
        Shapes[]shapes= new Shapes[3];
        shapes[0]=new Rectangle();
        shapes[1]=new Circle();
        shapes[2]=new Square();
        for (Shapes s:shapes) {
            if (s instanceof Square){
                ((Square)s).howToColor();
            }
            System.out.println(s);
        }

    }
}
