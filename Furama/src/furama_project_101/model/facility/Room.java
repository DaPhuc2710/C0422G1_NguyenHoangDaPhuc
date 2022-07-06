package furama_project_101.model.facility;

public class Room extends Facility {
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String serName, double areaUse, int fee, int maxPeople, String rentTypes, String freeServices) {
        super(serName, areaUse, fee, maxPeople, rentTypes);
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
        return "Room{" + super.toString() +
                "freeServices='" + freeServices + '\'' +
                '}';
    }

    public String getInfoToCSVRoom() {
        return getSerName() + "," + getAreaUse() + "," +   getFee() +  "," + getMaxPeople() + "," + getRentTypes() + "," + getFreeServices();
    }
}
