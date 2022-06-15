package ss7_abstract_interface.bai_tap.resizeable_for_geometries;

public abstract class Shapes {
    private String color = "Green";
    private boolean filled = true;

    public Shapes() {
    }

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


    @Override
    public String toString() {
        return " A Shape with color of{" +
                "color='" + getColor() + '\'' +
                ", filled=" + (isFilled() ? "filled" : "not fillted")+'}';
    }
}
