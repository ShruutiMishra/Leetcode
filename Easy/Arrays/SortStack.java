import java.util.*;

public class SortStack {
    static void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            while (!temp.isEmpty() && top < temp.peek()) {
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println("stack is " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(6);
        sortStack(stack);
    }
}
