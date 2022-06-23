package ss13_Sort.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list's size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("The List is\t:" + Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
        System.out.println("The List after sort is\t:");
        System.out.print(Arrays.toString(list));


    }
}
