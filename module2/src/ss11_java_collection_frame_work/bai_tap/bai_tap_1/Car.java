package ss11_java_collection_frame_work.bai_tap.bai_tap_1;

public class Car extends Vehicle implements Comparable<Car> {
    int id;
    double price;

    public Car() {

    }

    public Car(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public Car(String name, String color, String madeIn, int id, double price) {
        super(name, color, madeIn);
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return (int) (o.getPrice() - this.getPrice());
    }
}
