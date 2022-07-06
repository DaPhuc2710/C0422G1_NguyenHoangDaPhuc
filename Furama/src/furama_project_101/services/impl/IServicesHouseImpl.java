package furama_project_101.services.impl;

import furama_project_101.commom.CheckFacility;
import furama_project_101.model.facility.House;
import furama_project_101.services.iservices_facility.IServicesHouse;
import furama_project_101.ultil.ReadAndWriteHouse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IServicesHouseImpl implements IServicesHouse {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Map<House, Integer> houseMap = ReadAndWriteHouse.houseReader("src/furama_project_101/data/source_house.csv");
        Set<House> houseSet = houseMap.keySet();
        for (House ho : houseSet) {
            System.out.println(ho + "," + houseMap.get(ho));
        }
    }

    @Override
    public void add() {
        String name;
        do {
            System.out.println("Enter the House's name");
            name = scanner.nextLine();
        } while (!CheckFacility.checkHouse(name));
        boolean flag;
        double areaUse;
        do {
            System.out.println("Please enter area used");
            areaUse = Double.parseDouble(scanner.nextLine());
            if (areaUse > 30) {
                flag = false;
            } else {
                System.out.println("Please enter again!");
                flag = true;
            }
        } while (flag);
        int fee;
        boolean flag1 = true;
        do {
            System.out.println("Please enter fee of used");
            fee = Integer.parseInt(scanner.nextLine());
            if (fee > 0) {
                flag1 = false;
            }
        } while (flag1);
        int maxPeople;
        boolean flag2 = true;
        do {
            System.out.println("Please enter number of people ");
            maxPeople = Integer.parseInt(scanner.nextLine());
            if (maxPeople > 0 && maxPeople < 20) {
                flag2 = false;
            }
        } while (flag2);
        String rentTypes;
        do {

            System.out.println("___Menu type of rent___");
            System.out.println(
                    "\n1.By day" + '\'' +
                            "\n2.By month" + '\'' +
                            "\n3.By hour " + '\'' +
                            "\n4.Return main menu" + '\'');
            System.out.println("Please enter type of rent");
            rentTypes = scanner.nextLine();
            switch (rentTypes) {
                case "1":
                    rentTypes = "By day";
                    break;
                case "2":
                    rentTypes = "By month";
                    break;
                case "3":
                    rentTypes = "By hour";
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (!rentTypes.equals("4"));

        int floor;
        boolean flag4 = true;
        do {
            System.out.println("please enter floor's number");
            floor = Integer.parseInt(scanner.nextLine());
            if (floor > 0) {
                flag4 = false;
            }
        } while (flag4);

        System.out.println("Enter House's quality");
        String quality = scanner.nextLine();
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        houseMap.put(new House(name, areaUse, fee, maxPeople, rentTypes, floor, quality), 0);
        ReadAndWriteHouse.houseWriter(houseMap, "src/furama_project_101/data/source_house.csv", true);


    }

    @Override
    public void displayListMaintenance() {


    }
}

