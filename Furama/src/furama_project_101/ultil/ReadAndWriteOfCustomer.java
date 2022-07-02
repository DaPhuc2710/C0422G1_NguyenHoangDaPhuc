package furama_project_101.ultil;

import furama_project_101.model.human.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteOfCustomer {
    public static List<Customer> readFileCustomer(String path) {
        List<Customer> customerList = new LinkedList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                customerList.add(new Customer(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
            }
            bufferedReader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public static void writeFileCustomer(List<Customer> customerList, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer cus : customerList) {
                bufferedWriter.write(cus.getInforToCSVCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
