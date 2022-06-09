package ss3_arrays.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the delete number");
        int number = num.nextInt();
        int i;
        boolean isExist = false;
        int index = -1;
        for (i = 0; i < array.length; i++) {
            if (number == array[i]) {
                array[i] = array[i + 1];
                index = 1;
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("The number is in\t" + index + "\t position");
        } else {
            System.out.println("Did not find any number");
            System.exit(0);
        }
        int j;
        for (j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
