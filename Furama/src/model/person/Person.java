package model.person;

public abstract class Person {

    private String name;
    private String dOfb;
    private boolean gender;
    private int idNumber;
    private int telephone; // nen de string
    private String email;
    public Person(){
    }

    public Person( String name, String dOfb, boolean gender, int idNumber, int telephone, String email) {

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

    public String getdOfb() {
        return dOfb;
    }

    public void setdOfb(String dOfb) {
        this.dOfb = dOfb;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
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
