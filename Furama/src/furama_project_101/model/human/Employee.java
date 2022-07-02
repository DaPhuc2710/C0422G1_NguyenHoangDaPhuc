package furama_project_101.model.human;

import java.time.LocalDate;

public class Employee extends Person {
    private String employeeId;
    private String level;
    private String status;
    private String salary;
    public Employee(){}

    public Employee(String employeeId, String level, String status, String salary) {
        this.employeeId = employeeId;
        this.level = level;
        this.status = status;
        this.salary = salary;
    }

    public Employee(String name, LocalDate dOfB, String gender, String idNumber, String telephoneNumber, String email, String employeeId, String level, String status, String salary) {
        super(name, dOfB, gender, idNumber, telephoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.status = status;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "employeeId='" + employeeId + '\'' +
                ", level='" + level + '\'' +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String getInforToCSVEmployee(){
        return getName()+","+getdOfB()+","+getGender()+","+getIdNumber()+","+getTelephoneNumber()+","+getEmail()+","+getEmployeeId()+","+getLevel()+","+getStatus()+","+Double.parseDouble(String.valueOf(getSalary()));
    }
}
