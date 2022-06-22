package ss12_Search.Binarry;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size");
        int n = Integer.parseInt(scanner.nextLine());
        int []arr= new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter key");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println(BinarySearch.binarySearch(arr,k));
    }
}
