package Easy.LinkedList;

public class MiddleElement {
    public Node head = null;
    public Node tail = null;

    // linked list node
    static class Node {
        int data;
        Node next;

        // constructor to create a new node
        // next is by deafult initialzed as
        // null

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            System.out.println("nodes of linked list are:");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public int findMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        MiddleElement LL = new MiddleElement();
        LL.addNode(1);
        LL.addNode(2);
        LL.addNode(3);
        LL.addNode(4);
        LL.addNode(5);

        LL.display();

        System.out.println("Middle element of the singly linked list is:" + LL.findMiddle());

    }

}
