package ss14_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1011 {
    public static void test2(){
        try {
            testtt.test();
        } catch (TestExceptiom e) {
            e.printStackTrace();
            System.out.println("fghgh");
        }
    }

    public static void main(String[] args) {
        test2();
    }
}
