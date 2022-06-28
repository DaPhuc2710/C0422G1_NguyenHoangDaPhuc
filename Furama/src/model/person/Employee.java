package model.person;

public class Employee extends Person {
    private String employeeId;
    private String acaLevel;
    private String status;
    private double wage;

    public Employee() {
    }

    public Employee(String employeeId, String acaLevel, String status, double wage) {
        this.employeeId = employeeId;
        this.acaLevel = acaLevel;
        this.status = status;
        this.wage = wage;
    }

    public Employee(String employeeId, String name, String dOfb, boolean gender, int idNumber, int telephone, String email, String acaLevel, String status, double wage) {
        super(name, dOfb, gender, idNumber, telephone, email);
        this.employeeId = employeeId;
        this.acaLevel = acaLevel;
        this.status = status;
        this.wage = wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAcaLevel() {
        return acaLevel;
    }

    public void setAcaLevel(String acaLevel) {
        this.acaLevel = acaLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", acaLevel='" + acaLevel + '\'' +
                ", status='" + status + '\'' +
                ", wage=" + wage +
                '}';
    }
}
