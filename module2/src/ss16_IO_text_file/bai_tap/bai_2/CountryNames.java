package ss16_IO_text_file.bai_tap.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CountryNames {
    public static List<String> readFile(String path) {
        List<String> countriesList = new ArrayList<>();
        File file = new File(path);
        FileReader fR = null;
        BufferedReader bR = null;
        String[] arr = null;
        try {
            fR = new FileReader(file);
            bR = new BufferedReader(fR);
            String line = "";
            while ((line = bR.readLine()) != null) {
                arr = line.split(",");
                Countries countries = new Countries(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countriesList.add(line);
            }
            bR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
        return countriesList;
    }

    public static void main(String[] args) {
        List<Countries> countriesList=new ArrayList<>();
        List<String> string=readFile("src/ss16_IO_text_file/bai_tap/bai_2/country.csv");
        for (String s:string ) {
            String[] arr = s.split(",");
            countriesList.add(new Countries(Integer.parseInt(arr[0]),arr[1],arr[2]));
        }
        for (Countries s: countriesList) {
            System.out.println(s);
        }
    }
}
