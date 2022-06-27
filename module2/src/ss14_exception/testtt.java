package ss14_exception;

import java.util.Scanner;

public class testtt {
    public static void test() throws TestExceptiom {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<0||a>10){
            throw new TestExceptiom("so nhap vao be hon -0 hoac lon hon 10");
        }
    }
}
