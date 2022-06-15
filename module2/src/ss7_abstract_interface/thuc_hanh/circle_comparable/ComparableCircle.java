package ss7_abstract_interface.thuc_hanh.circle_comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;//  cái lớn hơn đưa lên đầu
        else if (getRadius() < o.getRadius()) return -1; // cái nhỏ hơn đưa xuống dưới
        else return 1;
    }

}
