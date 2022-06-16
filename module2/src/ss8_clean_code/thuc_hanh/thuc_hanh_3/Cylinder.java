package ss8_clean_code.thuc_hanh.thuc_hanh_3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
