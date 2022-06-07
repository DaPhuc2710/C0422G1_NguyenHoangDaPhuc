package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);// khai báo đối tượng scanner
        System.out.println("Enter width:");
        width = scanner.nextFloat();// nhập chiều rộng
        System.out.println("Enter height:");
        height = scanner.nextFloat();// nhập chiều dài
        float area = height * width;
        System.out.println("Area is:"+area);


    }
}
