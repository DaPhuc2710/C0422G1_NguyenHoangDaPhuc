package furama_project_101.services.impl;

import furama_project_101.services.iservices_facility.IServicesFac;


import java.util.Scanner;

public class ServicesFacilityImpl implements IServicesFac {
    Scanner scanner = new Scanner(System.in);
    IServicesRoomImpl iServicesRoom = new IServicesRoomImpl();
    IServicesHouseImpl iServicesHouse = new IServicesHouseImpl();
    IServicesVillaImpl iServicesVilla = new IServicesVillaImpl();

    @Override
    public void display() {
        String num;
        do {
            System.out.println("____Facility display menu____");
            System.out.println(
                    "1.\tDisplay New Villa\n" +
                    "2.\tDisplay New House\n" +
                    "3.\tDisplayNew Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("Enter your choice");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    iServicesVilla.display();

                    break;
                case "2":
                    iServicesHouse.display();

                    break;
                case "3":
                    iServicesRoom.display();

                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (!num.equals("4"));

    }

    @Override
    public void add() {

        String num;
        do {
            System.out.println("____Facility adding menu____" );
            System.out.println(
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("Enter your choice");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    iServicesVilla.add();

                    break;
                case "2":
                    iServicesHouse.add();

                    break;
                case "3":
                    iServicesRoom.add();

                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (!num.equals("4"));
    }

    @Override
    public void displayListMaintenance() {

    }


}
