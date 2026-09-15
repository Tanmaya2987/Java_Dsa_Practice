package week8;

public class NthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findNthFromEnd(Node head, int n) {

        Node first = head;
        Node second = head;

        // Move first n steps
        for (int i = 0; i < n; i++) {

            if (first == null) {
                return null;
            }

            first = first.next;
        }

        // Move both together
        while (first != null) {

            first = first.next;
            second = second.next;
        }

        return second;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 3;

        Node result = findNthFromEnd(head, n);

        System.out.println("Nth node from end: " + result.data);
    }
}