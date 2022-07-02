package furama_project.model.person;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private LocalDate dOfb;
    private String gender;
    private int idNumber;
    private int telephone; // nen de string
    private String email;

    public Person() {
    }

    public Person(String name, LocalDate dOfb, String gender, int idNumber, int telephone, String email) {

        this.name = name;
        this.dOfb = dOfb;
        this.gender = gender;
        this.idNumber = idNumber;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getdOfb() {
        return dOfb;
    }

    public void setdOfb(LocalDate dOfb) {
        this.dOfb = dOfb;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
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
                ", name='" + name + '\'' +
                ", dOfb='" + dOfb + '\'' +
                ", gender=" + gender +
                ", idNumber=" + idNumber +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}
