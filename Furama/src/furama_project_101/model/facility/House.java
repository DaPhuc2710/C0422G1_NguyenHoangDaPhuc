package furama_project_101.model.facility;

public class House extends Facility {
    private int floor;
    private String quality;

    public House() {
    }

    public House(int floor, String quality) {
        this.floor = floor;
        this.quality = quality;
    }

    public House(String serName, double areaUse, int fee, int maxPeople, String rentTypes, int floor, String quality) {
        super(serName, areaUse, fee, maxPeople, rentTypes);
        this.floor = floor;
        this.quality = quality;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "floor=" + floor +
                ", quality='" + quality + '\'' +
                '}';
    }
    public String getInfoToCSVHouse(){
        return getSerName() + "," + getAreaUse() + "," +  getFee() + "," + getMaxPeople() + "," + getRentTypes()+","+getFloor()+","+getQuality();
    }
}
