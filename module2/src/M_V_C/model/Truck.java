package M_V_C.model;

public class Truck extends Vehicle {
    private int load;
    public Truck(){}

    public Truck(int load) {
        this.load = load;
    }

    public Truck(int vehicleNumber, Manufacturer producer, int yearOfManufacture, String owner, int load) {
        super(vehicleNumber, producer, yearOfManufacture, owner);
        this.load = load;
    }

}
