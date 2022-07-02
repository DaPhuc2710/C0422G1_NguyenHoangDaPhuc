package furama_project_101.services.impl;

import furama_project_101.commom.Check;
import furama_project_101.model.human.Employee;
import furama_project_101.services.IServicesEmployee;
import furama_project_101.ultil.ReadAndWriteOfEmployee;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IServicesEmployeeImpl implements IServicesEmployee {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteOfEmployee.readFileEmployee("src/furama_project_101/data/employee_data/file_source_employee.csv");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

    }

    @Override
    public void add() {

        String name;
        do {
            System.out.println("Enter employee's name");
            name = scanner.nextLine();
        } while (!Check.checkName(name));
        boolean isOke;
        LocalDate dOfBirth = null;
        do {
            isOke = true;
            try {
                System.out.println("Please enter employee's birth");
                dOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Please enter again!");
                isOke = false;
            }
        } while (!isOke);


        String gender;
        boolean flag = true;
        do {
            System.out.println(
                    "1.\tMale\n" +
                            "2.\tFemale\n" +
                            "3.\tLGBT\n");
            System.out.println("Enter employee's sex");
            gender = scanner.nextLine();
            switch (gender) {
                case "1":
                    gender = "Male";
                    flag = false;
                    break;
                case "2":
                    gender = "Female";
                    flag = false;
                    break;
                case "3":
                    gender = "LGBT";
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (flag);

        String idNumber;
        do {
            System.out.println("Please enter employee ID number");
            idNumber = scanner.nextLine();
        } while (!Check.checkIdNumber(idNumber));
        String telephoneNumber;
        do {
            System.out.println("Please enter employee telephone number");
            telephoneNumber = scanner.nextLine();
        } while (!Check.checkTelephone(telephoneNumber));
        String email;
        do {
            System.out.println("Please enter employee email");
            email = scanner.nextLine();
        } while (!Check.checkEmail(email));
        String employeeId;
        do {
            System.out.println("Please enter employee ID");
            employeeId = scanner.nextLine();
        } while (!Check.checkEmpId(employeeId));
        String level;
        System.out.println("Please enter employee level");
        boolean flag1 = true;
        do {
            System.out.println(
                    "\nEnter Employee's Academic level" + '\'' +
                            "\n1.Intermediate" + '\'' +
                            "\n2.College" + '\'' +
                            "\n3.University" + '\'' +
                            "\n4.University Graduated" + '\'');
            level = scanner.nextLine();
            switch (level) {
                case "1":
                    level = "Intermediate";
                    flag1 = false;
                    break;
                case "2":
                    level = "College";
                    flag1 = false;
                    break;
                case "3":
                    level = "University";
                    flag1 = false;
                    break;
                case "4":
                    level = "University Graduated";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (flag1);
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
        System.out.println("Please enter employee's payment");
        String salary = scanner.nextLine();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(name, dOfBirth, gender, idNumber, telephoneNumber, email, employeeId, level, status, salary));
        ReadAndWriteOfEmployee.writeFileEmployee(employeeList, "src/furama_project_101/data/employee_data/file_source_employee.csv", true);
    }


    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWriteOfEmployee.readFileEmployee("src/furama_project_101/data/employee_data/file_source_employee.csv");
        System.out.println("Enter ID ID number of employee need to fix");
        String idNumber = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdNumber().equals(idNumber)) {
                String name;
                do {
                    System.out.println("Enter employee's name");
                    name = scanner.nextLine();
                } while (!Check.checkName(name));
                employeeList.get(i).setName(name);
                boolean isOke;
                LocalDate dOfBirth = null;
                do {
                    isOke = true;
                    try {
                        System.out.println("Please enter employee's birth");
                        dOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    } catch (DateTimeParseException e) {
                        System.out.println("Please enter again!");
                        isOke = false;
                    }
                } while (!isOke);
                employeeList.get(i).setdOfB(dOfBirth);


                String gender;
                boolean flag = true;
                do {
                    System.out.println(
                            "1.\tMale\n" +
                                    "2.\tFemale\n" +
                                    "3.\tLGBT\n");
                    System.out.println("Enter employee's sex");
                    gender = scanner.nextLine();

                    switch (gender) {
                        case "1":
                            gender = "Male";
                            flag = false;
                            break;
                        case "2":
                            gender = "Female";
                            flag = false;
                            break;
                        case "3":
                            gender = "LGBT";
                            flag = false;
                            break;
                        default:
                            System.out.println("Please enter again!");
                    }
                } while (flag);
                employeeList.get(i).setGender(gender);
                do {
                    System.out.println("Please enter employee ID number");
                    idNumber = scanner.nextLine();
                } while (!Check.checkIdNumber(idNumber));
                employeeList.get(i).setIdNumber(idNumber);
                String telephoneNumber;
                do {
                    System.out.println("Please enter employee telephone number");
                    telephoneNumber = scanner.nextLine();
                } while (!Check.checkTelephone(telephoneNumber));
                employeeList.get(i).setTelephoneNumber(telephoneNumber);
                String email;
                do {
                    System.out.println("Please enter employee email");
                    email = scanner.nextLine();
                } while (!Check.checkEmail(email));
                employeeList.get(i).setEmail(email);
                String employeeId;
                do {
                    System.out.println("Please enter employee ID");
                    employeeId = scanner.nextLine();
                } while (!Check.checkEmpId(employeeId));
                employeeList.get(i).setEmployeeId(employeeId);
                String level;
                System.out.println("Please enter employee level");
                boolean flag1 = true;
                do {
                    System.out.println(
                            "\nEnter Employee's Academic level" + '\'' +
                                    "\n1.Intermediate" + '\'' +
                                    "\n2.College" + '\'' +
                                    "\n3.University" + '\'' +
                                    "\n4.University Graduated" + '\'');
                    level = scanner.nextLine();
                    switch (level) {
                        case "1":
                            level = "Intermediate";
                            flag1 = false;
                            break;
                        case "2":
                            level = "College";
                            flag1 = false;
                            break;
                        case "3":
                            level = "University";
                            flag1 = false;
                            break;
                        case "4":
                            level = "University Graduated";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Please enter again!");
                    }
                } while (flag1);
                employeeList.get(i).setLevel(level);
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
                employeeList.get(i).setStatus(status);
                System.out.println("Please enter employee's payment");
                String salary = scanner.nextLine();
                employeeList.get(i).setSalary(salary);
                ReadAndWriteOfEmployee.writeFileEmployee(employeeList, "src/furama_project_101/data/employee_data/file_source_employee.csv", false);
            }
        }
    }
}


