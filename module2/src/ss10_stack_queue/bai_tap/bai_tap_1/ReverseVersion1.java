package ss10_stack_queue.bai_tap.bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println("Enter elements of the Array");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        Stack<Integer> stack = new Stack<>();
        for (int element : arr) { //biến element là biến đại  diện cho tất cả các biến trong mảng arr
            stack.add(element); // thêm những element của arr vào stack
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();// xóa các biến trong stack và thêm các biến đó vào mảng
        }
        System.out.println(Arrays.toString(arr)); // kết quả in ra sẽ là đảo ngược ( theo đặc điểm của Stack)
    }
}
