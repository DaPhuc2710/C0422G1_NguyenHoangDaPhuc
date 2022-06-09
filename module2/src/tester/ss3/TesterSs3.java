package tester.ss3;

public class TesterSs3 {
    public static void main(String[] args) {
        double b=9.1234;
        System.out.println(myMethod(5));
        System.out.println(myMethod(b));
    }
    public static int myMethod(int a) { // void không cho return
        return a * 10;
    }
    public static double myMethod(double a) { // void không cho return
        return a * 10;
    }

}
