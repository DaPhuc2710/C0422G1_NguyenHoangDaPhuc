package furama_project_101.model.facility;

public class Villa extends Facility {
    private String quality;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String quality, double poolArea, int floor) {
        this.quality = quality;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String serName, double areaUse, int fee, int maxPeople, String rentTypes, String quality, double poolArea, int floor) {
        super(serName, areaUse, fee, maxPeople, rentTypes);
        this.quality = quality;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
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
        return "Villa{" + super.toString() +
                "quality='" + quality + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }

    public String getInfoToCSVVilla() {
        return getSerName() + "," + getAreaUse() + "," + getFee() + "," + getMaxPeople() + "," + getRentTypes() + "," + getQuality() + "," + getPoolArea() + "," + getFloor();
    }
}
