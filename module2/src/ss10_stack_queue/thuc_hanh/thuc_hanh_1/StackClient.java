package ss10_stack_queue.thuc_hanh.thuc_hanh_1;

import java.util.Stack;

public class StackClient {
    // Cài đặt phương thức  stackOfStrings
    private static void stackOfStrings() {
        MyGenericStack<String> stringStack = new MyGenericStack();
        stringStack.push("five");
        stringStack.push("four");
        stringStack.push("three");
        stringStack.push("two");
        stringStack.push("one");
        System.out.println("Stack after push operations: " + stringStack.size());
        System.out.printf("Pop element from stack: \n");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
        System.out.println("\n 1.3. Size of stack after pop  operations" + stringStack.size());
    }
    // Cài đặt phương thức  stackOfInteger
    private static void stackOfInteger(){
        MyGenericStack<Integer>integerStack= new MyGenericStack();
        integerStack.push(5);
        integerStack.push(4);
        integerStack.push(3);
        integerStack.push(2);
        integerStack.push(1);
        integerStack.push(0);
        System.out.println("Stack after push operations"+integerStack.size());
        System.out.println("Pop element from stack");
        while (!integerStack.isEmpty()){
            System.out.println(integerStack.pop());
        }
        System.out.println("\n Size of stack after pop operations"+integerStack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfStrings();
        System.out.println("Stack of integer");
        stackOfInteger();
    }


}
