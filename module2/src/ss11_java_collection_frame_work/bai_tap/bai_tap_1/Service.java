package ss11_java_collection_frame_work.bai_tap.bai_tap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Car> arrayList = new ArrayList<>();

    public void add() {
        System.out.println("Enter car's name");
        String name = scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter product's place");
        String madeIn = scanner.nextLine();
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());

        arrayList.add(new Car(name, color, madeIn, id, price));
        display();
    }

    public void display() {
        for (Car c : arrayList
        ) {
            System.out.println(c);
        }
    }

    public void delete() {
        System.out.println("Delete id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(arrayList.get(i));
                return;
            }
        }
        System.out.println("No exist id");
        display();
    }

    public void edit() {
        System.out.println("Change id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                System.out.println("Enter car's name");
                String name = scanner.nextLine();
                System.out.println("Enter color");
                String color = scanner.nextLine();
                System.out.println("Enter product's place");
                String madeIn = scanner.nextLine();
            }
        }
        display();
    }

    public void search() {
        System.out.println("Enter name wanna search");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                System.out.println("The product is:");
                System.out.println(arrayList.get(i));
            }
        }
    }

    public void sort() {
        Collections.sort(arrayList);
        display();
    }
}