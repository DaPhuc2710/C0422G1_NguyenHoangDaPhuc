package furama_project_101.services.impl;

import furama_project_101.commom.Check;
import furama_project_101.ultil.ReadAndWriteOfCustomer;
import furama_project_101.model.human.Customer;
import furama_project_101.services.IServicesCustomer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IServicesCustomerImpl implements IServicesCustomer {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteOfCustomer.readFileCustomer("src/furama_project_101/data/file_source_customer.csv");
        for (Customer cus : customerList) {
            System.out.println(cus);
        }

    }

    @Override
    public void add() {
        String name;
        do {
            System.out.println("Enter customer's name");
            name = scanner.nextLine();
        } while (!Check.checkName(name));

        boolean isOke;
        LocalDate dOfBirth = null;
        do {
            isOke = true;
            try {
                System.out.println("Please enter customer's birth");
                dOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Please enter again");
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
        while (true) {
            System.out.println("Please enter ID number");
            idNumber = scanner.nextLine();
            if (Check.checkIdNumber(idNumber)) {
                break;
            } else {
                System.out.println("Please enter again!");
            }
        }
        String telephoneNumber;
        while (true) {
            System.out.println("Please enter customer telephone number");
            telephoneNumber = scanner.nextLine();
            if (Check.checkTelephone(telephoneNumber)) {
                break;
            } else {
                System.out.println("Please enter again!");
            }
        }
        String email;
        while (true) {
            System.out.println("Please enter customer email");
            email = scanner.nextLine();
            if (Check.checkEmail(email)) {
                break;
            } else {
                System.out.println("Please enter again!");
            }
        }
        String customerId;
        while (true) {
            System.out.println("Please enter customer ID");
            customerId = scanner.nextLine();
            if (Check.checkCustomerId(customerId)) {
                break;
            } else {
                System.out.println("Please enter again!");
            }
        }
        String typeOfCustomer;
        System.out.println("Please enter type of customer");
        boolean flag1 = true;
        do {
            System.out.println(
                    "\nEnter Type of customer" + '\'' +
                            "\n1.Diamond" + '\'' +
                            "\n2.Platinum" + '\'' +
                            "\n3.Gold" + '\'' +
                            "\n4.Silver" + '\'' +
                            "\n5.Member" + '\'');
            typeOfCustomer = scanner.nextLine();
            switch (typeOfCustomer) {
                case "1":
                    typeOfCustomer = "Diamond";
                    flag1 = false;
                    break;
                case "2":
                    typeOfCustomer = "Platinum";
                    flag1 = false;
                    break;
                case "3":
                    typeOfCustomer = "Gold";
                    flag1 = false;
                    break;
                case "4":
                    typeOfCustomer = "Silver";
                    flag1 = false;
                    break;
                case "5":
                    typeOfCustomer = "Member";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (flag1);

        String address;
        do {
            System.out.println("Please enter customer's address");
            address = scanner.nextLine();
        } while (!Check.checkAddress(address));
        List<Customer> customerList = new LinkedList<>();
        customerList.add(new Customer(name, dOfBirth, gender, idNumber, telephoneNumber, email, customerId, typeOfCustomer, address));
        ReadAndWriteOfCustomer.writeFileCustomer(customerList, "src/furama_project_101/data/file_source_customer.csv", true);

    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteOfCustomer.readFileCustomer("src/furama_project_101/data/file_source_customer.csv");
        System.out.println("Enter ID number of customer need to fix");
        String idNumber = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdNumber().equals(idNumber)) {
                String name;
                do {
                    System.out.println("Enter customer's name");
                    name = scanner.nextLine();
                } while (!Check.checkName(name));
                customerList.get(i).setName(name);
                boolean isOke;
                LocalDate dOfBirth = null;
                do {
                    isOke = true;
                    try {
                        System.out.println("Please enter customer's birth");
                        dOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    } catch (DateTimeParseException e) {
                        System.out.println("Please enter again");
                        isOke = false;
                    }
                } while (!isOke);
                customerList.get(i).setdOfB(dOfBirth);


                String gender;
                boolean flag = true;
                do {
                    System.out.println(
                            "1.\tMale\n" +
                                    "2.\tFemale\n" +
                                    "3.\tLGBT\n");
                    System.out.println("Enter employee's sex");
                    gender = scanner.nextLine();
                    customerList.get(i).setGender(gender);
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
                customerList.get(i).setGender(gender);
                do {
                    System.out.println("Please enter ID number");
                    idNumber = scanner.nextLine();
                } while (!Check.checkIdNumber(idNumber));
                customerList.get(i).setIdNumber(idNumber);
                String telephoneNumber;
                do {
                    System.out.println("Please enter customer telephone number");
                    telephoneNumber = scanner.nextLine();
                } while (!Check.checkTelephone(telephoneNumber));
                customerList.get(i).setTelephoneNumber(telephoneNumber);
                String email;
                do {
                    System.out.println("Please enter customer email");
                    email = scanner.nextLine();
                } while (!Check.checkEmail(email));

                customerList.get(i).setEmail(email);
                String customerId;
                do {
                    System.out.println("Please enter customer ID");
                    customerId = scanner.nextLine();
                } while (!Check.checkCustomerId(customerId));
                customerList.get(i).setCustomerId(customerId);

                String typeOfCustomer;
                System.out.println("Please enter type of customer");
                boolean flag1 = true;
                do {
                    System.out.println(
                            "\nEnter Type of customer" + '\'' +
                                    "\n1.Diamond" + '\'' +
                                    "\n2.Platinum" + '\'' +
                                    "\n3.Gold" + '\'' +
                                    "\n4.Silver" + '\'' +
                                    "\n5.Member" + '\'');
                    typeOfCustomer = scanner.nextLine();
                    switch (typeOfCustomer) {
                        case "1":
                            typeOfCustomer = "Diamond";
                            flag1 = false;
                            break;
                        case "2":
                            typeOfCustomer = "Platinum";
                            flag1 = false;
                            break;
                        case "3":
                            typeOfCustomer = "Gold";
                            flag1 = false;
                            break;
                        case "4":
                            typeOfCustomer = "Silver";
                            flag1 = false;
                            break;
                        case "5":
                            typeOfCustomer = "Member";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Please enter again!");
                    }
                } while (flag1);
                customerList.get(i).setTypeOfCustomer(typeOfCustomer);


                String address;
                do {
                    System.out.println("Please enter customer's address");
                    address = scanner.nextLine();
                } while (!Check.checkAddress(address));
                customerList.get(i).setAddress(address);
                ReadAndWriteOfCustomer.writeFileCustomer(customerList, "src/furama_project_101/data/file_source_customer.csv", false);

            }
        }
    }
}
