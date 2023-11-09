package Easy.Stack;

import java.util.Scanner;

public class StackusingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of stack");
        int n = sc.nextInt();

        stack s = new stack();

        System.out.println("enter the elements to push to the stack");
        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();
            s.push(e);
        }

        // s.push(10);
        // s.push(20);
        // s.push(30);
        System.out.println("elements of stack are ");
        s.print();
        System.out.println("top of the stack before deleting " + s.top());
        System.out.println("size of stack before deleting element " + s.size());
        System.out.println("deleted element is " + s.pop());
        System.out.println("top of the stack after deleting " + s.top());
    }
}

class stack {
    int size = 100;
    int[] arr = new int[size];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    int top() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + arr[i]);
        }
    }

}
