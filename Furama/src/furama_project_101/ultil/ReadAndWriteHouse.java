package furama_project_101.ultil;


import furama_project_101.model.facility.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteHouse {
    public static Map<House, Integer> houseReader(String path) {
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                System.out.println();
                houseMap.put(new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4],Integer.parseInt(arr[5]),arr[6]), Integer.parseInt(arr[7]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseMap;
    }

    public static void houseWriter(Map<House, Integer> houseMap, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houseSet = houseMap.keySet();
            for (House ho : houseSet) {
                bufferedWriter.write(ho.getInfoToCSVHouse() + "," + houseMap.get(ho));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

