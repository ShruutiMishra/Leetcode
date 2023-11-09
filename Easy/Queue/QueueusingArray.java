package Easy.Queue;

import java.util.Queue;

public class QueueusingArray {

    class Queue {

        private int front, rear, size, MAX;

        private int[] arr;

        public Queue() {
            arr = new int[16];
            rear = -1;
            front = -1;
            size = 0;
        }

        public Queue(int MAX) {
            this.MAX = MAX;
            arr = new int[MAX];
            rear = -1;
            front = -1;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == MAX;
        }

        void push(int x) {
            if (isFull()) {
                System.out.println("queue is full\nExiting...");
                return;
            }
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % MAX;
            }
            arr[rear] = x;
            size++;
            System.out.println(x + " pushed to the queue");
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int popped = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % MAX;
            }
            size--;
            return popped;
        }

        int top() {
            return arr[front];
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        QueueusingArray outerInstance = new QueueusingArray();
        Queue q = outerInstance.new Queue(6);
        q.push(4);
        q.push(5);
        q.push(45);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
