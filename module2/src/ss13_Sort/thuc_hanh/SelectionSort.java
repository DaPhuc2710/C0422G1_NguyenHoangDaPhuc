package ss13_Sort.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min=j;
                }
                if (min != i) {
                    double temp=list[min];
                    list[min]=list[i];
                    list[i]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Before"+Arrays.toString(list));
        selectionSort(list);
        System.out.println("After"+Arrays.toString(list));
    }
}
