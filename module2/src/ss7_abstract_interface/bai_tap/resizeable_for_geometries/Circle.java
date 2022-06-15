package ss7_abstract_interface.bai_tap.resizeable_for_geometries;

public class Circle extends Shapes implements Resizerable {
    private double radius = 2.0;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
 @Override
    public double getArea() {
        return this.radius * this.radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 0;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Area of Circle is=" + getArea() +
                '}';
    }
    @Override
    public void resize(double percent){
        radius+=radius*percent/100;
    }
}
