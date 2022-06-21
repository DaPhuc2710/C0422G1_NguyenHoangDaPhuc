package ss11_java_collection_frame_work.bai_tap.bai_tap_1;

public class Vehicle {

    String name;
    String color;
    String madeIn;

    public Vehicle() {
    }

    public Vehicle(String name, String color, String madeIn) {
        this.name = name;
        this.color = color;
        this.madeIn = madeIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}

