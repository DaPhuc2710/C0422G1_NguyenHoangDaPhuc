package ss3_arrays.bai_tap;


import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the col ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        System.out.println("Enter  element of the array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Element of" + i + "-" + j + ":" + arr[i][j] + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("the Max element of Array is" + max);
    }
}

