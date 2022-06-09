package ss3_arrays.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the length is 10");
        int[] array = new int[10];
        System.out.println("Enter the Element of Array");
        for (int i = 0; i < 7; i++) {// vì sao để 7 => để phần dư ra mới thêm 1 số vào được
            array[i] = Integer.parseInt(scanner.nextLine());// nhập các phần tử của mảng
        }
        System.out.println(Arrays.toString(array));// in mảng
        System.out.println("Enter the add number");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the position need to add");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > array.length - 1) {
            System.out.println("Can not add");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}

