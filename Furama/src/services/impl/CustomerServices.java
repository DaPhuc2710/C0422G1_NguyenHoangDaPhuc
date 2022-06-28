package services.impl;

import model.person.Customer;
import services.ICustomerServices;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServices implements ICustomerServices {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Customer> cumstomerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer("Nguyễn Hà Duyên", "23/07/2000",
                false, 201611223, 915164418, "duyen23@gmail.com",
                "Cus1", "Diamond", "DN");
        Customer customer2 = new Customer("Nguyễn Hoàng Đa Phúc", "27/10/2000",
                false, 201611222, 905842301, "daphuc2000@gmail.com",
                "Cus2", "Gold", "HN");
        Customer customer3 = new Customer("Nguyễn Hà ", "23/07/2000",
                false, 201511223, 915161718, "duyen2307@gmail.com",
                "Cus3", "Member", "QN");
    }

    @Override
    public void display() {


    }

    @Override
    public void add() {
        System.out.println("Nhập tên của khách");
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
        System.out.println("Nhập id của khách");
        String customerId = scanner.nextLine();
        System.out.println("Nhập loại khách");
        String typeOfCustomer = "";
        boolean flag = true;
        do {
            System.out.println
                    ("Menu loại khách hàng" + '\'' +
                            "1.Diamond" + '\'' +
                            "2.Platinum" + '\'' +
                            "3.Gold" + '\'' +
                            "4.Silver" + '\'' +
                            "5.Member" + '\'');
            System.out.println("Hãy nhập số tương ứng");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    typeOfCustomer += "Diamond";
                    break;
                case 2:
                    typeOfCustomer += "Platinum";
                    break;
                case 3:
                    typeOfCustomer += "Gold";
                    break;
                case 4:
                    typeOfCustomer += "Silver";
                    break;
                case 5:
                    typeOfCustomer += "Member";
                    break;
            }
        } while (flag);
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
    }

    @Override
    public void edit() {
        System.out.println("Nhập CMND của khách để sửa");
        int idNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cumstomerList.size(); i++) {
            if (cumstomerList.get(i).getIdNumber() == idNumber) {
                System.out.println("Nhập tên của khách hàng");
                cumstomerList.get(i).setName(scanner.nextLine());
                System.out.println("Ngày tháng năm sinh");
                cumstomerList.get(i).setdOfb(scanner.nextLine());
                System.out.println("Nhập giới tính");
                cumstomerList.get(i).setGender(true);
                System.out.println("Nhập số CMND");
                cumstomerList.get(i).setIdNumber(scanner.nextInt());
                System.out.println("Nhập số điện thoại");
                cumstomerList.get(i).setTelephone(scanner.nextInt());
                System.out.println("Nhập email");
                cumstomerList.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập Id của khách hàng");
                cumstomerList.get(i).setCustomerId(scanner.nextLine());
                System.out.println("Nhập loại khách hàng");
                cumstomerList.get(i).setTypeOfCustomer(scanner.nextLine());
                boolean flag1 = true;
                do {
                    System.out.println("Menu loại khách hàng" + '\'' +
                            "1.Diamond" + '\'' +
                            "2.Platinum" + '\'' +
                            "3.Gold" + '\'' +
                            "4.Silver" + '\'' +
                            "5.Member" + '\'');
                    System.out.println("Hãy nhập số tương ứng");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    switch (num1) {
                        case 1:
                            cumstomerList.get(i).setTypeOfCustomer("Diamond");
                            break;
                        case 2:
                            cumstomerList.get(i).setTypeOfCustomer("Platinum");
                            break;
                        case 3:
                            cumstomerList.get(i).setTypeOfCustomer("Gold");
                            break;
                        case 4:
                            cumstomerList.get(i).setTypeOfCustomer("Silver");
                            break;

                        case 5:
                            cumstomerList.get(i).setTypeOfCustomer("Member");
                            break;
                    }
                } while (flag1);
                System.out.println("Nhập địa chỉ");
                cumstomerList.get(i).setAddress(scanner.nextLine());
            }
        }
    }

}
