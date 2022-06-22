package ss12_Search.Binarry;


import java.util.LinkedList;
import java.util.Scanner;

public class StringAscending {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String");
        String string=scanner.nextLine();
        LinkedList<Character>max=new LinkedList<>();
        LinkedList<Character>list=new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if (string.charAt(j)> list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (max.size()< list.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character m:max) {
            System.out.print(m);
        }
    }
}
