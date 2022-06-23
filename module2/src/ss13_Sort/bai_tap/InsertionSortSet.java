package ss13_Sort.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list's Size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Before" + Arrays.toString(list));
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];// x lúc này sẽ là pt tại vị trí i ví dụ x=2
            pos = i; // index pos= 1
            while (pos > 0 && x < list[pos - 1]) {// ví dụ list[0]= 10 >x=2
                list[pos]=list[pos-1];   // đổi vị trí  ví dụ  list[0]=10=>list[1]=10
                pos--;
            }
            list[pos]=x; // list[0] lúc này sẽ là x=2
        }
        System.out.println("After:"+Arrays.toString(list));
    }
}
