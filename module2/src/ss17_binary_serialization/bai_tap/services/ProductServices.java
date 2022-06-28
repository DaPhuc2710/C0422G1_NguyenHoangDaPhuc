package ss17_binary_serialization.bai_tap.services;

import ss17_binary_serialization.bai_tap.model.Product;
import ss17_binary_serialization.bai_tap.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ProductServices implements IServices {
    Scanner scanner = new Scanner(System.in);
    final String PATH_FILE_PRODUCT = "src/ss17_binary_serialization/bai_tap/util/file_doc.txt";

    @Override
    public void add() {
        List<Product> products = ReadAndWrite.read(PATH_FILE_PRODUCT);
        System.out.println("Enter code");
        int codeName = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter producer");
        String producer = scanner.nextLine();
        System.out.println("price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter any specific");
        String other = scanner.nextLine();
        products.add(new Product(codeName, name, producer, price, other));
        ReadAndWrite.write(PATH_FILE_PRODUCT, products);


    }

    @Override
    public void display() {
        List<Product> products = ReadAndWrite.read(PATH_FILE_PRODUCT);
        for (Product p : products
        ) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter code need to search");
        int code = Integer.parseInt(scanner.nextLine());
        List<Product> products = ReadAndWrite.read("src/ss17_binary_serialization/bai_tap/util/file_doc.txt");
        for (int i = 0; i < products.size(); i++) {
            if (code == products.get(i).getCodeName()) {
                System.out.println(products.get(i));
            }
        }

    }
}
