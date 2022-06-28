package model.facities;

public abstract class Facilities {
    private String name;
    private double area;
    private double price;
    private int maxPeople;
    private String types;
    public Facilities(){
    }

    public Facilities(String name, double area, double price, int maxPeople, String types) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Facilities{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", types='" + types + '\'' +
                '}';
    }
}
