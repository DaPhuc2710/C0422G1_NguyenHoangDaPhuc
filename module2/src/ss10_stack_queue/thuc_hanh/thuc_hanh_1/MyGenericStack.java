package ss10_stack_queue.thuc_hanh.thuc_hanh_1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack; // tạo stack có thuộc tính trả về là LinkedList<T>

    public MyGenericStack() {
        stack = new LinkedList();

    }
    public void push(T element){
        stack.addFirst(element);

    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }else {
            return false;
        }

    }

}
