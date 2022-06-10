package ss4_oop.bai_tap;

public class Main {
    public static int sum(int n){
        int total =0;
        for (int i = 0; i < n; i++) {
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum = sum(1000);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
