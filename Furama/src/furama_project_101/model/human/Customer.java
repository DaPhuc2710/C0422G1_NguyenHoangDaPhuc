package furama_project_101.model.human;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerId;
    private String typeOfCustomer;
    private String address;
    public  Customer(){}

    public Customer(String customerId, String typeOfCustomer, String address) {
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String name, LocalDate dOfB, String gender, String idNumber, String telephoneNumber, String email, String customerId, String typeOfCustomer, String address) {
        super(name, dOfB, gender, idNumber, telephoneNumber, email);
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
        return "Customer{" +super.toString()+
                "customerId='" + customerId + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInforToCSVCustomer(){
        return getName()+","+getdOfB()+","+getGender()+","+getIdNumber()+","+getTelephoneNumber()+","+getEmail()+","+getCustomerId()+","+getTypeOfCustomer()+","+getAddress();
    }
}
