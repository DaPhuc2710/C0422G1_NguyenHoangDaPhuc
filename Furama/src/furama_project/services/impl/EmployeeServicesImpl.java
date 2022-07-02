package furama_project.services.impl;

import furama_project.model.person.Employee;
import furama_project.services.IEmployeeServices;
import furama_project.ultil.ReadAndWriteEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServicesImpl implements IEmployeeServices {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteEmployee.readEmployee("src/data/employee_data.csv");
        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter Employee's ID");
        String employeeId = scanner.nextLine();
        System.out.println("Enter Employee's name");
        String name = scanner.nextLine();
        System.out.println("Date of Birth");
        LocalDate dOfb = LocalDate.parse(scanner.nextLine());
        System.out.println("Choose gender");
        boolean fGender = true;
        String gender;
        do {
            System.out.println("1.Female");
            System.out.println("2.Male");
            System.out.println("Enter number for gender");
            gender = scanner.nextLine();
            switch (gender) {
                case "1":
                    gender = "Female";
                    fGender = false;
                    break;
                case "2":
                    gender = "Male";
                    fGender = false;
                    break;
            }
        } while (fGender);
        System.out.println("Enter ID");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter telephone number");
        int telephone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email");
        String email = scanner.nextLine();
        String acaLevel;
        boolean fAcaLevel = true;
        do {
            System.out.println
                    ("Menu Academic level" + '\'' +
                            "1.Intermediate" + '\'' +
                            "2.College" + '\'' +
                            "3.University" + '\'' +
                            "4.University Graduated" + '\'');
            System.out.println("Choose Academic's level");
            acaLevel = scanner.nextLine();
            switch (acaLevel) {
                case "1":
                    acaLevel = "Intermediate";
                    fAcaLevel = false;
                    break;
                case "2":
                    acaLevel = "College";
                    fAcaLevel = false;
                    break;
                case "3":
                    acaLevel = "University";
                    fAcaLevel = false;
                    break;
                case "4":
                    acaLevel = "University Graduated";
                    fAcaLevel = false;
                    break;
                default:
                    System.out.println("Please enter again!");

            }
        } while (fAcaLevel);
        String status;
        boolean fStatus = true;

        do {
            System.out.println
                    ("Menu Employee's status" + '\'' +
                            "\n1.Receptionist" + '\'' +
                            "\n2.Service" + '\'' +
                            "\n3.Expert" + '\'' +
                            "\n4.Supervisor" + '\'' +
                            "\n5.Manager" + '\'' +
                            "\n6.Director" + '\'');
            System.out.println("Enter position's number");
            status = scanner.nextLine();
            switch (status) {
                case "1":
                    status = "Receptionist";
                    fStatus = false;
                    break;
                case "2":
                    status = "Service";
                    fStatus = false;
                    break;
                case "3":
                    status = "Expert";
                    fStatus = false;
                    break;
                case "4":
                    status = "Supervisor";
                    fStatus = false;
                    break;
                case "5":
                    status = "Manager";
                    fStatus = false;
                    break;
                case "6":
                    status = "Director";
                    fStatus = false;
                    break;
                default:
                    System.out.println("Please enter again!");

            }
        } while (fStatus);

        System.out.println("Enter Employee's payment");
        double wage = Double.parseDouble (scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(employeeId, name, dOfb, gender, idNumber, telephone, email, acaLevel, status, wage));
        String str = "src/data/employee_data.csv";
        ReadAndWriteEmployee.writeEmployee(str,employeeList,true);


    }

    @Override
    public void edit() {
        List<Employee> employeeList = new ArrayList<>();
        System.out.println(" Enter ID need to fix");
        int idNumber = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (employee.getIdNumber() == idNumber) {
                System.out.println("Enter Employee's ID");
                employee.setEmployeeId(scanner.nextLine());
                System.out.println("Enter telephone number");
                employee.setName(scanner.nextLine());
                System.out.println("Date of Birth");
                employee.setdOfb(LocalDate.parse(scanner.nextLine()));
                boolean fGender2 = true;
                do {
                    System.out.println("1.Female");
                    System.out.println("2.Male");
                    System.out.println("Enter number for gender");
                    String number = scanner.nextLine();
                    switch (number) {
                        case "1":
                            employee.setGender("Female");
                            fGender2 = false;
                            break;
                        case "2":
                            employee.setGender("Male");
                            fGender2 = false;
                            break;
                    }
                } while (fGender2);

                System.out.println("Enter ID");
                employee.setIdNumber(scanner.nextInt());
                System.out.println("Enter telephone number");
                employee.setTelephone(scanner.nextInt());
                System.out.println("Enter email");
                employee.setEmail(scanner.nextLine());
                employee.setAcaLevel(scanner.nextLine());
                boolean fAcaLevel2 = true;
                do {
                    System.out.println
                            ("\nEnter Employee's Academic level" + '\'' +
                                    "\n1.Intermediate" + '\'' +
                                    "\n2.College" + '\'' +
                                    "\n3.University" + '\'' +
                                    "\n4.University Graduated" + '\'');
                    System.out.println("Choose Academic's level");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            employee.setAcaLevel("Intermediate");
                            fAcaLevel2 = false;
                            break;
                        case 2:
                            employee.setAcaLevel("College");
                            fAcaLevel2 = false;
                            break;
                        case 3:
                            employee.setAcaLevel("University");
                            fAcaLevel2 = false;
                            break;
                        case 4:
                            employee.setAcaLevel("University Graduated");
                            fAcaLevel2 = false;
                            break;
                    }
                } while (fAcaLevel2);
                employee.setStatus(scanner.nextLine());
                boolean Status2 = true;
                do {
                    System.out.println
                            ("\nMenu Employee's status" + '\'' +
                                    "\n1.Receptionist" + '\'' +
                                    "\n2.Service" + '\'' +
                                    "\n3.Expert" + '\'' +
                                    "\n4.Supervisor" + '\'' +
                                    "\n5.Manager" + '\'' +
                                    "\n6.Director" + '\'');
                    System.out.println("Enter position's number");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    switch (num1) {
                        case 1:
                            employee.setStatus("Receptionist");
                            Status2 = false;
                            break;
                        case 2:
                            employee.setStatus("Service");
                            Status2 = false;
                            break;
                        case 3:
                            employee.setStatus("Expert");
                            Status2 = false;
                            break;
                        case 4:
                            employee.setStatus("Supervisor");
                            Status2 = false;
                            break;

                        case 5:
                            employee.setStatus("Manager");
                            Status2 = false;
                            break;
                        case 6:
                            employee.setStatus("Director");
                            Status2 = false;
                            break;
                    }
                } while (Status2);
                System.out.println("Enter Employee's payment");
                employee.setWage(scanner.nextInt());
            }
        }
    }
}
