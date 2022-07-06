package furama_project_101.services.impl;

import furama_project_101.commom.CheckFacility;
import furama_project_101.model.facility.Villa;
import furama_project_101.services.iservices_facility.IServicesVilla;
import furama_project_101.ultil.ReadAndWriteVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IServicesVillaImpl implements IServicesVilla {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Map<Villa, Integer> villaMap = ReadAndWriteVilla.villaReader("src/furama_project_101/data/facility_data/source_villa.csv");
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa vl : villaSet) {
            System.out.println(vl + "," + villaMap.get(vl));
        }

    }

    @Override
    public void add() {
        String name;
        do {
            System.out.println("Enter the Villa's name");
            name = scanner.nextLine();
        } while (!CheckFacility.checkVilla(name));
        double areaUse;
        boolean flag;
        do {
            System.out.println("Please enter area used");
            areaUse = Double.parseDouble(scanner.nextLine());
            if (areaUse > 30) {
                flag = false;
            } else {
                System.out.println("Please enter again!");
                flag = true;
            }
        }
        while (flag);
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
        String quality;
        do {
            System.out.println(
                    "\n1.Legendary" + '\'' +
                            "\n2.Luxury" + '\'' +
                            "\n3.High" + '\'' +
                            "\n4.Return main menu" + '\'');
            System.out.println("Enter Villa's quality");
            quality = scanner.nextLine();
            switch (quality) {
                case "1":
                    quality = "Legendary";
                    break;
                case "2":
                    quality = "Luxury";
                    break;
                case "3":
                    quality = "High";
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (!quality.equals("4"));
        double poolArea;
        boolean flag5 = true;
        do {
            System.out.println("Please enter pool area used");
            poolArea = Double.parseDouble(scanner.nextLine());
            if (poolArea > 30) {
                flag5 = false;
            }
        } while (flag5);
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        villaMap.put(new Villa(name, areaUse, fee, maxPeople, rentTypes, quality, poolArea, floor), 0);
        ReadAndWriteVilla.writeFileRoom(villaMap, "src/furama_project_101/data/facility_data/source_villa.csv", true);


    }

    @Override
    public void displayListMaintenance() {

    }
}
