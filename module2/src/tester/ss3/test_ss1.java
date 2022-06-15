package tester.ss3;

import java.util.Scanner;

public class test_ss1 {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Element in array");
        int j, k;
        for (j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (k = 0; k < array.length / 2; k++) {
            int tmp = array[k];
            array[k] = array[size - 1 - k];// ví dụ như khi i =1 => arr[1]=2; arr[1]=arr[10-1-1]
            array[size - 1 - k] = tmp;
        }
        System.out.println("The reverse array");
        int l;
        for (l = 0; l < array.length; l++) {
            System.out.println(array[l]);
        }
    }
}
