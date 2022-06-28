package model.person;

public class Customer extends Person {
    private String customerId;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String customerId, String typeOfCustomer, String address) {
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String name, String dOfb, boolean gender, int idNumber, int telephone, String email, String customerId, String typeOfCustomer, String address) {
        super(name, dOfb, gender, idNumber, telephone, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
