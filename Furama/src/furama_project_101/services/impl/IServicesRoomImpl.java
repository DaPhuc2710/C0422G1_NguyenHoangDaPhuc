package furama_project_101.services.impl;
import furama_project_101.commom.CheckFacility;
import furama_project_101.model.facility.Room;
import furama_project_101.services.iservices_facility.IServicesRoom;
import furama_project_101.ultil.ReadAndWriteRoom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IServicesRoomImpl implements IServicesRoom {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Map<Room, Integer> roomMap = ReadAndWriteRoom.roomReader("src/furama_project_101/data/facility_data/source_room.csv");
        Set<Room> roomSet = roomMap.keySet();
        for (Room ro : roomSet) {
            System.out.println(ro + "," + roomMap.get(ro)); // ro dùng để lấy key, còn room.get(ro) là lấy value
        }
    }

    @Override
    public void add() {
        String name;
        do {
            System.out.println("Enter the Room's name");
            name = scanner.nextLine();
        } while (!CheckFacility.checkRoom(name));
        boolean flag = true;
        double areaUse;
        do {
            System.out.println("Please enter area used");
            areaUse = Double.parseDouble(scanner.nextLine());
            if (areaUse > 30) {
                flag = false;
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
        System.out.println("Please enter free services");
        String freeSer = scanner.nextLine();
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        roomMap.put(new Room(name, areaUse, fee, maxPeople, rentTypes, freeSer), 0);
        ReadAndWriteRoom.writeFileRoom(roomMap, "src/furama_project_101/data/facility_data/source_room.csv", true);
    }

    @Override
    public void displayListMaintenance() {

    }
}
