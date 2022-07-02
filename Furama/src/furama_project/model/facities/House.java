package furama_project.model.facities;

public class House extends Facilities {
    private String roomQuality;
    private int floor;

    public House() {
    }

    public House(String roomQuality, int floor) {
        this.roomQuality = roomQuality;
        this.floor = floor;
    }

    public House(String name, double area, double price, int maxPeople, String types, String roomQuality, int floor) {
        super(name, area, price, maxPeople, types);
        this.roomQuality = roomQuality;
        this.floor = floor;
    }

    public String getRoomQuality() {
        return roomQuality;
    }

    public void setRoomQuality(String roomQuality) {
        this.roomQuality = roomQuality;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomQuality='" + roomQuality + '\'' +
                ", floor=" + floor +
                '}';
    }
}
