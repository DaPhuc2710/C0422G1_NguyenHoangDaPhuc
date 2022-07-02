package furama_project.services.impl;

import furama_project.model.person.Customer;
import furama_project.services.ICustomerServices;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServicesImpl implements ICustomerServices {
     static Scanner scanner = new Scanner(System.in);




    @Override
    public void display() {


    }

    @Override
    public void add() {
        System.out.println("Enter customer's name");
        String name = scanner.nextLine();
        System.out.println("Enter Date of Birth");
        LocalDate dOfb = LocalDate.parse(scanner.nextLine());
        System.out.println("Choose gender");
        boolean fGender = true;
        String gender;

        do {
            System.out.println("Enter number for gender");
            System.out.println("1.Female");
            System.out.println("2.Male");
            gender = scanner.nextLine();
            switch (gender) {
                case "1":
                    System.out.println("Female");
                    fGender = false;
                    break;
                case "2":
                    System.out.println(".Male");
                    fGender = false;
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (fGender);

        System.out.println("Enter ID");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter telephone");
        int telephone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter customer ID");
        String customerId = scanner.nextLine();
        System.out.println("Type of customer");
        String typeOfCustomer = "";
        boolean fAdd = true;
        do {
            System.out.println
                    ("\nMenu type of customer" + '\'' +
                            "\n1.Diamond" + '\'' +
                            "\n2.Platinum" + '\'' +
                            "\n3.Gold" + '\'' +
                            "\n4.Silver" + '\'' +
                            "\n5.Member" + '\'');
            System.out.println("Choose number for type of customer");
            String num = scanner.nextLine();
            switch (num) {
                case "1":
                    typeOfCustomer = "Diamond";
                    fAdd = false;
                    break;
                case "2":
                    typeOfCustomer = "Platinum";
                    fAdd = false;
                    break;
                case "3":
                    typeOfCustomer = "Gold";
                    fAdd = false;
                    break;
                case "4":
                    typeOfCustomer = "Silver";
                    fAdd = false;
                    break;
                case "5":
                    typeOfCustomer = "Member";
                    fAdd = false;
                    break;
            }
        } while (fAdd);
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        LinkedList<Customer> customerList = new LinkedList<>();
        customerList.add(new Customer(name, dOfb, gender, idNumber, telephone,
                email, customerId, typeOfCustomer, address));
    }

    @Override
    public void edit() {
        LinkedList<Customer> customerList = new LinkedList<>();
        System.out.println("Enter ID need to fix");
        int idNumber = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (customer.getIdNumber() == idNumber) {
                System.out.println("Enter customer's name");
                customer.setName(scanner.nextLine());
                System.out.println("Enter Date of Birth");
                customer.setdOfb(LocalDate.parse(scanner.nextLine()));
                boolean fGender2 = true;
                do {
                    System.out.println("1.Female");
                    System.out.println("2.Male");
                    System.out.println("Enter number for gender");
                    String number = scanner.nextLine();
                    switch (number) {
                        case "1":
                            customer.setGender("Female");
                            fGender2 = false;
                            break;
                        case "2":
                            customer.setGender("Male");
                            fGender2 = false;
                            break;
                    }
                } while (fGender2);
                customer.setIdNumber(scanner.nextInt());
                System.out.println("Enter telephone number");
                customer.setTelephone(scanner.nextInt());
                System.out.println("Enter  email");
                customer.setEmail(scanner.nextLine());
                System.out.println("Enter customer ID");
                customer.setCustomerId(scanner.nextLine());
                System.out.println("Enter type of customer");
                customer.setTypeOfCustomer(scanner.nextLine());
                boolean fEdit = true;
                do {
                    System.out.println("\nMenu type of customer" + '\'' +
                            "\n1.Diamond" + '\'' +
                            "\n2.Platinum" + '\'' +
                            "\n3.Gold" + '\'' +
                            "\n4.Silver" + '\'' +
                            "\n5.Member" + '\'');
                    System.out.println("Choose ");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    switch (num1) {
                        case 1:
                            customer.setTypeOfCustomer("Diamond");
                            fEdit = false;
                            break;
                        case 2:
                            customer.setTypeOfCustomer("Platinum");
                            fEdit = false;
                            break;
                        case 3:
                            customer.setTypeOfCustomer("Gold");
                            fEdit = false;
                            break;
                        case 4:
                            customer.setTypeOfCustomer("Silver");
                            fEdit = false;
                            break;

                        case 5:
                            customer.setTypeOfCustomer("Member");
                            fEdit = false;
                            break;
                        default:
                            System.out.println("Please enter again!");
                    }
                } while (fEdit);
                System.out.println("Enter Address");
                customer.setAddress(scanner.nextLine());
            }
        }
    }

}
