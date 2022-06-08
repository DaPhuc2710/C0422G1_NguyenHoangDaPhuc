package ss2_loop_statement.bai_tap;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        int count = 0;
        int num;
        int n=2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the number");
        num = input.nextInt();
        while (count<num){
            boolean result=true;
            for (int test=n-1; test >1 ; test--) {
                if (n%test==0){
                    result=false;
                }
            }
            if (result){
                System.out.println(n);
                count++;
            }n++;
        }
    }
}
