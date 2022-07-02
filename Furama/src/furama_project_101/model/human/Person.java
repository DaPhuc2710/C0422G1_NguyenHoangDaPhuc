package furama_project_101.model.human;

import java.time.LocalDate;

public abstract class  Person {
    private String name;
    private LocalDate dOfB;
    private String gender;
    private String idNumber;
    private String telephoneNumber;
    private String email;
    public Person(){}

    public Person(String name, LocalDate dOfB, String gender, String idNumber, String telephoneNumber, String email) {
        this.name = name;
        this.dOfB = dOfB;
        this.gender = gender;
        this.idNumber = idNumber;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getdOfB() {
        return dOfB;
    }

    public void setdOfB(LocalDate dOfB) {
        this.dOfB = dOfB;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dOfB=" + dOfB +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
