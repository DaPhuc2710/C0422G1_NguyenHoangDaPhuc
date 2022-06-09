package ss3_arrays.thuc_hanh;

import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        String[] student = {"Mia", "Phúc", "Peter", "Jackson"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's name ");
        String in_put = scanner.nextLine();
        boolean isExsit = false;
        int i;
        for (i = 0; i < student.length; i++) {
            if (student[i].equals(in_put)) {
                System.out.println("Position student in the list \t" + in_put + "\tis\t" + i);
                isExsit = true;
                break;
            }
        }
        if (!isExsit) {
            System.out.println("Not found\t" + in_put + "\tin the list");
        }
    }
}
