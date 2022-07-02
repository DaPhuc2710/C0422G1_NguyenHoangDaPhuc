package furama_project.ultil;


import furama_project.model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteEmployee {
    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                employeeList.add(new Employee(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], Integer.parseInt(arr[4]),
                        Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static void writeEmployee(String path, List<Employee> employeeList, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee emp:employeeList) {
                bufferedWriter.write(emp.getInForToCSVEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
