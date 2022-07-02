package furama_project_101.ultil;

import furama_project_101.model.human.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteOfEmployee {
    public static List<Employee> readFileEmployee(String path) {
        List<Employee> employeeList = new LinkedList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                employeeList.add(new Employee(arr[0], LocalDate.parse(arr[1]), arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public static void writeFileEmployee(List<Employee> employeeList ,String path, boolean append){
        File file= new File(path);
        FileWriter fileWrite;
        BufferedWriter bufferedWriter;
        try {
            fileWrite= new FileWriter(file);
            bufferedWriter= new BufferedWriter(fileWrite);
            for (Employee emp: employeeList) {
                bufferedWriter.write(emp.getInforToCSVEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
