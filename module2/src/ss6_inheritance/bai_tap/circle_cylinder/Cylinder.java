package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    double height = 4.6;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getRadius() * getHeight() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder with radius is" + getRadius() +
                "color='" + color + '\'' +
                ", height=" + height +
                "The Volume is " + getVolume();
    }
}
