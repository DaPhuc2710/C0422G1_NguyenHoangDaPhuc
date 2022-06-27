package ss16_IO_text_file.thuc_hanh;
import java.util.List;
public class FindMax {
    public static  int Max(List<Integer>list ){
        int max=list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            if (max<list.get(i)){
                max= list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWrite rw= new ReadAndWrite();
        List list=rw.readFile("src/ss16_IO_text_file/thuc_hanh/file.txt");
        rw.writeFile("src/ss16_IO_text_file/thuc_hanh/file.txt",Max(list));
    }
}
