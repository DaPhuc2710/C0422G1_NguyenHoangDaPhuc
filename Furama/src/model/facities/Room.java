package model.facities;

import model.facities.Facilities;

public class Room extends Facilities {
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String name, double area, double price, int maxPeople, String types, String freeServices) {
        super(name, area, price, maxPeople, types);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                '}';
    }
}
