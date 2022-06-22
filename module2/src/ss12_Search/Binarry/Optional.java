package ss12_Search.Binarry;

import java.util.LinkedList;
import java.util.Scanner;

public class Optional {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string= scanner.nextLine();
        LinkedList<Character> max= new LinkedList<>();
        LinkedList<Character>list= new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            if (list.size()>1 &&list.getLast()>=string.charAt(i)) {
                list.clear();
            }
            list.add(string.charAt(i));
        }
        if (max.size()< list.size()){
            max.clear();
            max.addAll(list);
        }
        for (Character m:max) {
            System.out.print(m);
        }
    }
}
