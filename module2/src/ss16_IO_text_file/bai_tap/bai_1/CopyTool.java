package ss16_IO_text_file.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyTool {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fR = null;
        BufferedReader bR= null;
        try {
            fR = new FileReader(file);
            bR= new BufferedReader(fR);
            String line="";
            while ((line= bR.readLine())!=null){
                list.add(line);
            }
            bR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
    public static void copyFile(List<String> list, String path){
        try {
            FileWriter fW= new FileWriter(path);
            BufferedWriter bW= new BufferedWriter(fW);
            for (int i = 0; i <list.size() ; i++) {
                bW.write(list.get(i));
                bW.newLine();
            }
            bW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
