package M_V_C.model;

public class Car extends Vehicle {
    private int seats;
    private  String types;
//    private boolean styleOfCar;
//    private final boolean forRent=false;
//    private final boolean forVacation=true;

    public Car(){
    }

    public Car(int seats, String types) {
        this.seats = seats;
        this.types = types;
    }

    public Car(int vehicleNumber, Manufacturer producer, int yearOfManufacture, String owner, int seats, String types) {
        super(vehicleNumber, producer, yearOfManufacture, owner);
        this.seats = seats;
        this.types = types;
    }
}
