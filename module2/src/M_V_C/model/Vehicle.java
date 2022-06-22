package M_V_C.model;

public class Vehicle {
    protected int vehicleNumber;
    protected Manufacturer producer;
    protected int yearOfManufacture;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(int vehicleNumber, Manufacturer producer, int yearOfManufacture, String owner) {
        this.vehicleNumber = vehicleNumber;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

}
