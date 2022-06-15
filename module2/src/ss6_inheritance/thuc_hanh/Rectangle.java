package ss6_inheritance.thuc_hanh;

public class Rectangle extends Shape {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width= width;
    }
    public Rectangle(double length , double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return " A Rectangle with length=" +
                length +
                ", width=" + width +
                "which is a subclass of"+
                super.toString();
    }
}
