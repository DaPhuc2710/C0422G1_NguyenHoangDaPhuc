package M_V_C.model;

public class MotoBike extends Vehicle {
    private int power;
    public MotoBike(){}

    public MotoBike(int power) {
        this.power = power;
    }

    public MotoBike(int vehicleNumber, Manufacturer producer, int yearOfManufacture, String owner, int power) {
        super(vehicleNumber, producer, yearOfManufacture, owner);
        this.power = power;
    }
}
