package ss2_loop_statement.thuc_hanh;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        if (num<2){
            System.out.println("Not a prime number");
        }else{
            int i=2;
            boolean check=true;
            while (i<num){
                if (num%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println("Is a prime number");
            }else {
                System.out.println("Is not a prime number");
            }
        }
    }
}
