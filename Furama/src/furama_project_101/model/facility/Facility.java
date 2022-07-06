package furama_project_101.model.facility;

public class Facility {
    private String serName;
    private double areaUse;
    private int fee;
    private int maxPeople;
    private String rentTypes;

    public Facility() {
    }

    public Facility(String serName, double areaUse, int fee, int maxPeople, String rentTypes) {
        this.serName = serName;
        this.areaUse = areaUse;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.rentTypes = rentTypes;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentTypes() {
        return rentTypes;
    }

    public void setRentTypes(String rentTypes) {
        this.rentTypes = rentTypes;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serName='" + serName + '\'' +
                ", areaUse=" + areaUse +
                ", fee=" + fee +
                ", maxPeople=" + maxPeople +
                ", rentTypes='" + rentTypes + '\'' +
                '}';
    }

    public String getInfoToCSVFacility(){
       return getSerName() + "," + getAreaUse() + "," + getFee() +  "," + getMaxPeople() + "," + getRentTypes();
    }
}
