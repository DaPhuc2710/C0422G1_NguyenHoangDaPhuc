package ss3_arrays.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class Concat2Arrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first length");// nhập dộ dài của mảng 1
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[size];
        System.out.println("Enter elements of Arr1");// nhập các phần tử của arr1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter second length");// nhập dộ dài của mảng 2
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[size1];
        System.out.println("Enter elements of Arr2");// nhập các phần tử cửa arr2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
