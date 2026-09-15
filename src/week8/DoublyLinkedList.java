package week8;

public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    // Insert at end
    static void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print forward
    static void printForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Print backward
    static void printBackward() {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    // Insert after a given key
    static void insertAfter(int key, int data) {

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Delete first occurrence
    static void delete(int key) {

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Delete all occurrences
    static void deleteAll(int key) {

        Node temp = head;

        while (temp != null) {

            Node next = temp.next;

            if (temp.data == key) {

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }

            temp = next;
        }
    }

    // Reverse DLL in-place
    static void reverse() {

        Node current = head;
        Node temp = null;

        while (current != null) {

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // Find second largest without sorting
    static int secondLargest() {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        Node temp = head;

        while (temp != null) {

            if (temp.data > largest) {
                second = largest;
                largest = temp.data;
            } else if (temp.data > second && temp.data != largest) {
                second = temp.data;
            }

            temp = temp.next;
        }

        return second;
    }

    // Check palindrome
    static boolean isPalindrome() {

        if (head == null) {
            return true;
        }

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != right && left.prev != right) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.prev;
        }

        return left.data == right.data;
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(20);
        insert(40);

        System.out.println("Forward:");
        printForward();

        System.out.println("Backward:");
        printBackward();

        insertAfter(30, 35);

        System.out.println("After inserting 35:");
        printForward();

        delete(35);

        System.out.println("After deleting 35:");
        printForward();

        System.out.println("Second largest: " + secondLargest());

        System.out.println("Palindrome: " + isPalindrome());
    }
}