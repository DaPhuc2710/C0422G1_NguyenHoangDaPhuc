package model.facities;

import model.facities.Facilities;

public class Villa extends Facilities {
    private String roomQuality;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomQuality, double poolArea, int floor) {
        this.roomQuality = roomQuality;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String name, double area, double price, int maxPeople, String types, String roomQuality, double poolArea, int floor) {
        super(name, area, price, maxPeople, types);
        this.roomQuality = roomQuality;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomQuality() {
        return roomQuality;
    }

    public void setRoomQuality(String roomQuality) {
        this.roomQuality = roomQuality;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomQuality='" + roomQuality + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
