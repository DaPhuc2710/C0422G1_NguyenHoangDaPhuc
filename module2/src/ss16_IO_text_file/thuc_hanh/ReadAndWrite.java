package ss16_IO_text_file.thuc_hanh;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Integer> readFile( String path){
        List<Integer> numbers= new ArrayList<>();
        File file= new File(path);
        try {
            FileReader fr= new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String line="";
            while ((line= br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
    public void writeFile(String path, int max){
        try {
            FileWriter fw= new FileWriter(path,true);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write("Gía trị lớn nhất"+ max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
