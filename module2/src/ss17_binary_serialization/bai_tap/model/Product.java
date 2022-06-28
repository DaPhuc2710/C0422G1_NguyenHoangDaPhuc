package ss17_binary_serialization.bai_tap.model;

public class Product {
    private int codeName;
    private String name;
    private String producer;
    private int price;
    private String other;

    public Product() {
    }
    public Product(int codeName, String name, String producer, int price, String other) {
        this.codeName = codeName;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.other = other;
    }

    public int getCodeName() {
        return codeName;
    }

    public void setCodeName(int codeName) {
        this.codeName = codeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeName=" + codeName +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
