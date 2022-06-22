package ss12_Search.Binarry;


import java.util.Arrays;

public class BinarySearch {
    static int[] arr = {2, 4, 6, 7, 8, 9, 10, 23, 26, 30};

    static int binarySearch(int[] arr, int key) {
        int first = 0;
        int end = arr.length - 1;
        while (first <= end) {
            int mid = (end + first) / 2 ;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        System.out.println("Index of 7\t:"+binarySearch(arr, 7));
        System.out.println("Index of 8\t:"+binarySearch(arr, 8));
        System.out.println("Index of 5\t:"+binarySearch(arr, 5));
        System.out.println("Index of 30\t:"+binarySearch(arr, 30));

    }
}
