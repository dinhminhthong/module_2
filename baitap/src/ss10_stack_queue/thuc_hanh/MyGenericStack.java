package ss10_stack_queue.thuc_hanh;

import sun.invoke.empty.Empty;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T>{
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }
public void push(T element){
        stack.addFirst(element);
}
public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();

        }
        return stack.removeFirst();
}
public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
}
private static void stackOfIStrings() {
    MyGenericStack<String> stack = new MyGenericStack();
    stack.push("mec");
    stack.push("vinfast");
    stack.push("audi");
    stack.push("toyota");
    stack.push("volvo");
//        System.out.println("1.1 Size of stack after push operation: "+stack.size());
//        System.out.println("1.2 Pop elements from stack: ");
//        while (!stack.isEmpty()){
//            System.out.println("%s",stack.pop());
//        }
//        System.out.println("\n1.3. Size of stack after pop operations : "+stack.size());
//
//}

}
}
