package ss12_Search.Binarry;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Test2 {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a String");
        String string= scanner.nextLine();
        ArrayList<Character> arrayList= new ArrayList<>();
        for (int i = 0; i <string.length() ; i++) {
            arrayList.add(string.charAt(i));
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        for (int i = 0; i <string.length() ; i++) {

        }
    }

}
