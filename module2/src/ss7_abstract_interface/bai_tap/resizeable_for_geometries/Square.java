package ss7_abstract_interface.bai_tap.resizeable_for_geometries;


import ss7_abstract_interface.bai_tap.colorable_for_geometries.Colorable;

public class Square extends Rectangle implements Resizerable, Colorable {
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side,String color, boolean filled) {
        super(side, side,color, filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide() + "area"
                + getArea()+
                 ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("color all four sides");
    }
}
