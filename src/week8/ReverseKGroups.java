package week8;

public class ReverseKGroups {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverseKGroup(Node head, int k) {

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {

            next = current.next;
            current.next = prev;

            prev = current;
            current = next;

            count++;
        }

        // Remaining nodes
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head = reverseKGroup(head, 2);

        print(head);
    }
}