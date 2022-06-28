package services.impl;

import model.person.Employee;
import services.IEmployeeServices;

import java.util.ArrayList;

import java.util.Scanner;

public class EmployeeServices implements IEmployeeServices {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("NV1", "Nguyen Van A", "21/10/1999", true, 201790843, 905842301, "daphuc2000@gmail.com", "Trung cấp", "Chuyên viên", 5000000);
        Employee employee2 = new Employee("NV2", "Nguyen Van A", "21/10/1999", true, 201790845, 905005005, "daphuc2000@gmail.com", "Đại học", "Quản lý", 7500000);
        Employee employee3 = new Employee("NV3", "Nguyen Van A", "21/10/1999", true, 201790849, 905123456, "daphuc2000@gmail.com", "Sau đại học", "Giám đốc", 10000000);
    }


    @Override
    public void display() {


    }

    @Override
    public void add() {
        System.out.println("Nhập id của nhân viên");
        String employeeId = scanner.nextLine();
        System.out.println("Nhập tên của nhân viên");
        String name = scanner.nextLine();
        System.out.println("Ngày tháng năm sinh");
        String dOfb = scanner.nextLine();
        System.out.println(" Nhập giới tính");
        boolean gender = true;
        System.out.println("Nhập số CMND");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        int telephone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ của nhân viên");
        String acaLevel = "";
        boolean flag = true;
        do {
            System.out.println
                    ("Menu trình độ nhân viên" + '\'' +
                            "1.Trung cấp" + '\'' +
                            "2.Cao đẳng" + '\'' +
                            "3.Đại học" + '\'' +
                            "4.Sau đại học" + '\'');
            System.out.println("Hãy nhập số tương ứng");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    acaLevel += "Trung cấp";
                    break;
                case 2:
                    acaLevel += "Cao đẳng";
                    break;
                case 3:
                    acaLevel += "Đại học";
                    break;
                case 4:
                    acaLevel += "Sau đại học";
                    break;
            }
        } while (flag);
        System.out.println("Nhập chức vụ của nhân viên");
        String status = "";
        boolean flag1 = true;
        do {
            System.out.println
                    ("Menu Vị trí của nhân viên" + '\'' +
                            "1.Lễ tân" + '\'' +
                            "2.Phục vụ" + '\'' +
                            "3.Chuyên viên" + '\'' +
                            "4.Giám sát" + '\'' +
                            "5.Quản lý" + '\'' +
                            "6.Giám đốc" + '\'');
            System.out.println("Hãy nhập số tương ứng");
            int num1 = Integer.parseInt(scanner.nextLine());
            switch (num1) {
                case 1:
                    status += "Lễ tân";
                    break;
                case 2:
                    status += "Phục vụ";
                    break;
                case 3:
                    status += "Chuyên viên";
                    break;
                case 4:
                    status += "Giám sát";
                    break;

                case 5:
                    status += "Quản lý";
                    break;
                case 6:
                    status += "Giám đốc";
                    break;
            }
        } while (flag1);

        System.out.println("Nhập tiền lương của nhân viên");
        int wage = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public void edit() {
        System.out.println(" Nhập CMND cần sửa");
        int idNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdNumber() == idNumber) {
                System.out.println("Nhập id của nhân viên");
                employeeList.get(i).setEmployeeId(scanner.nextLine());
                System.out.println("Nhập tên của nhân viên");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.println("Ngày tháng năm sinh");
                employeeList.get(i).setdOfb(scanner.nextLine());
                System.out.println(" Nhập giới tính");
                employeeList.get(i).setGender(true);
                System.out.println("Nhập số CMND");
                employeeList.get(i).setIdNumber(scanner.nextInt());
                System.out.println("Nhập số điện thoại");
                employeeList.get(i).setTelephone(scanner.nextInt());
                System.out.println("Nhập email");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập trình độ của nhân viên");
                employeeList.get(i).setAcaLevel(scanner.nextLine());
                boolean flag = true;
                do {
                    System.out.println
                            ("Menu trình độ nhân viên" + '\'' +
                                    "1.Trung cấp" + '\'' +
                                    "2.Cao đẳng" + '\'' +
                                    "3.Đại học" + '\'' +
                                    "4.Sau đại học" + '\'');
                    System.out.println("Hãy nhập số tương ứng");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            employeeList.get(i).setAcaLevel("Trung cấp");
                            break;
                        case 2:
                            employeeList.get(i).setAcaLevel("Cao đẳng");
                            break;
                        case 3:
                            employeeList.get(i).setAcaLevel("Đại học");
                            break;
                        case 4:
                            employeeList.get(i).setAcaLevel("Sau đại học");
                            break;
                    }
                } while (flag);
                System.out.println("Nhập chức vụ của nhân viên");
                employeeList.get(i).setStatus(scanner.nextLine());
                boolean flag1 = true;
                do {
                    System.out.println
                            ("Menu Vị trí của nhân viên" + '\'' +
                                    "1.Lễ tân" + '\'' +
                                    "2.Phục vụ" + '\'' +
                                    "3.Chuyên viên" + '\'' +
                                    "4.Giám sát" + '\'' +
                                    "5.Quản lý" + '\'' +
                                    "6.Giám đốc" + '\'');
                    System.out.println("Hãy nhập số tương ứng");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    switch (num1) {
                        case 1:
                            employeeList.get(i).setStatus("Lễ tân");
                            break;
                        case 2:
                            employeeList.get(i).setStatus("Phục vụ");
                            break;
                        case 3:
                            employeeList.get(i).setStatus("Chuyên viên");
                            break;
                        case 4:
                            employeeList.get(i).setStatus("Giám sát");
                            break;

                        case 5:
                            employeeList.get(i).setStatus("Quản lý");
                            break;
                        case 6:
                            employeeList.get(i).setStatus("Giám đốc");
                            break;
                    }
                } while (flag);
                System.out.println("Nhập tiền lương của nhân viên");
                employeeList.get(i).setWage(scanner.nextInt());
            }
        }
    }
}
