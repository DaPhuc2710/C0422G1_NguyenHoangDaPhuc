package ss17_binary_serialization.bai_tap.controller;

import ss17_binary_serialization.bai_tap.services.ProductServices;

import java.util.Scanner;

public class Menu {
    public static void display() {
        boolean flag = true;
        do {
            System.out.println("Products Manager" +
                    "\n1. Adding new product" +
                    "\n2. Displaying " +
                    "\n3. Searching" +
                    "\n4. Exiting");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = Integer.parseInt(scanner.nextLine());
            ProductServices productServices= new ProductServices();
            switch (number) {
                case 1:productServices.add();
                    break;
                case 2: productServices.display();
                    break;
                case 3: productServices.search();
                    break;
                default:
                    System.out.println("Please enter again!");
            }
        } while (flag);
    }

}
