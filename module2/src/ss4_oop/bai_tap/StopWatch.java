package ss4_oop.bai_tap;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
     private long startTime,endTime;
    public StopWatch( long startTime, long endTime){
        this.endTime=endTime;
    }
    public StopWatch(){

    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis(); // lấy về thời gian của hệ thống
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        for (int i = 0; i <10000 ; i++) {
            sum=sum+n;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
