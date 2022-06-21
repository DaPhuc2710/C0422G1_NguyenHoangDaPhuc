package ss11_java_collection_frame_work.bai_tap.bai_tap_1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        boolean flag = true;
        do {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Edit");
            System.out.println("4. Search");
            System.out.println("5. Sort");
            System.out.println("0. Exit");
            System.out.println("ENTER NUMBER");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    service.add();
                    break;
                case 2:
                    service.delete();
                    break;
                case 3:
                    service.edit();
                    break;
                case 4:
                    service.search();
                    break;
                case 5:
                    service.sort();
                default:
                    flag = false;
            }
        }
        while (flag);
    }
}