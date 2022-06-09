package ss3_arrays.thuc_hanh;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");// quy định array không vượt quá 20
            }
        } while (size > 20);
        array = new int[size];// tạo mảng với dộ dài là size
        int i = 0;
        while (i < size) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Element in array");
        int j, k;
        for (j = 0; j < array.length; j++) {// in ra array và các phần tử của nó
            System.out.println(array[j] + "\t");
        }
        for (k = 0; k < array.length / 2; k++) { // nghĩa là dùng để đổi 2 phần tử đầu cuối nếu mảng dó là số lẽ thì sẽ giữ số giữa
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.println("Reverse array:");
        int l;
        for (l = 0; l < array.length; l++) {
            System.out.println(array[l] + "\t");
        }

    }
}
