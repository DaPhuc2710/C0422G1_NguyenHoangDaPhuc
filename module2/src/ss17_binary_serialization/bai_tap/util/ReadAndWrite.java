package ss17_binary_serialization.bai_tap.util;

import ss17_binary_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void write(String path, List<Product> productList) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutStream = new ObjectOutputStream(fileOutputStream);
            objectOutStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutStream.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public static List<Product> read(String path) {
        List<Product> productList = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);

                productList = (List<Product>) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file.length() > 0) {
                    objectInputStream.close();
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return productList;
    }
}


