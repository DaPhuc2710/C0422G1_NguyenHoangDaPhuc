package furama_project_101.ultil;



import furama_project_101.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteVilla {
    public static Map<Villa, Integer> villaReader(String path) {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                villaMap.put(new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5],Double.parseDouble(arr[6]),Integer.parseInt(arr[7])), Integer.parseInt(arr[8]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaMap;
    }

    public static void writeFileRoom(Map<Villa, Integer> villaMap, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villaSet = villaMap.keySet();
            for (Villa vl:villaSet) {
                bufferedWriter.write(vl.getInfoToCSVVilla() + "," + villaMap.get(vl));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

