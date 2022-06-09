package ss3_arrays.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FinhMin {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int size=Integer.parseInt(scanner.nextLine());
        int[]arr=new int[size];
        System.out.println("Enter element of Array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the Min number of Array is\t"+min);
    }
}
