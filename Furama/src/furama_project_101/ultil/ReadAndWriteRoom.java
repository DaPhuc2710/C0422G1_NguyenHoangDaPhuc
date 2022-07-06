package furama_project_101.ultil;



import furama_project_101.model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class ReadAndWriteRoom {
    public static Map<Room, Integer> roomReader(String path) {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                roomList.put(new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]), Integer.parseInt(arr[6]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public static void writeFileRoom(Map<Room, Integer> roomList, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Room> roomSet = roomList.keySet();
            for (Room r:roomSet) {
                bufferedWriter.write(r.getInfoToCSVRoom() + "," + roomList.get(r));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
