package furama_project_101.ultil;

import furama_project_101.model.facility.Facility;
import furama_project_101.model.facility.House;
import furama_project_101.model.facility.Room;
import furama_project_101.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteFacility {
    public static Map<Facility,Integer> readFile(String path){
        Map<Facility,Integer> facilityMap= new LinkedHashMap<>();
        File file= new File(path);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader= new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[]arr= line.split(",");
                if (arr.length==7){
                    facilityMap.put((new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            arr[4],Integer.parseInt(arr[5]),arr[6])),Integer.parseInt(arr[7]));
                }else if (arr.length==6){
                    facilityMap.put((new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            arr[4],arr[5])),Integer.parseInt(arr[6]));
                }else if (arr.length==8){
                    facilityMap.put((new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            arr[4],arr[5],Double.parseDouble(arr[6]),Integer.parseInt(arr[7]))),Integer.parseInt(arr[8]));
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityMap;
    }
}
