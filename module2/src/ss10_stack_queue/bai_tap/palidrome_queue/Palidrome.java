package ss10_stack_queue.bai_tap.palidrome_queue;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Palidrome {
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = scanner.nextLine();
        for (int i = word.length() - 1; i >= 0; i--) {
            queue.add(word.charAt(i));
        }
        boolean flag = true;
        String result = "";
        while (!queue.isEmpty()) {
            result += queue.poll();
        }
        if (result.equals(word)){
            flag=true;
        }else {
            flag=false;
        }
        if (flag){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome ");
        }


    }
}

