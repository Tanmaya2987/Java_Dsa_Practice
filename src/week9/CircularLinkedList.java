package week9;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    // Insert at end
    static void insert(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Print the circular list
    static void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Count nodes
    static int countNodes() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Search an element
    static boolean search(int key) {

        if (head == null) {
            return false;
        }

        Node temp = head;

        do {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    // Find maximum element
    static int findMaximum() {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int max = head.data;
        Node temp = head.next;

        while (temp != head) {

            if (temp.data > max) {
                max = temp.data;
            }

            temp = temp.next;
        }

        return max;
    }

    // Insert at beginning
    static void insertBeginning(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Delete a specific node
    static void delete(int key) {

        if (head == null) {
            return;
        }

        // If head is the node to delete
        if (head.data == key) {

            // Only one node
            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;

            return;
        }

        Node prev = head;
        Node current = head.next;

        while (current != head) {

            if (current.data == key) {
                prev.next = current.next;
                return;
            }

            prev = current;
            current = current.next;
        }
    }

    // Find middle element
    static int findMiddle() {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head &&
               fast.next.next != head) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Print list in reverse order
    static void reversePrint(Node current) {

        if (current == null) {
            return;
        }

        // Find last node
        Node last = head;

        while (last.next != head) {
            last = last.next;
        }

        reversePrintHelper(last);
    }

    static void reversePrintHelper(Node current) {

        if (current == head) {
            System.out.print(current.data + " ");
            return;
        }

        Node previous = head;

        while (previous.next != current) {
            previous = previous.next;
        }

        reversePrintHelper(previous);

        System.out.print(current.data + " ");
    }

    // Josephus problem
    static int josephus(int n, int k) {

        if (n == 1) {
            return 1;
        }

        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {

        // Insert elements
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        System.out.println("Circular list:");
        printList();

        // Count
        System.out.println("Number of nodes: " + countNodes());

        // Search
        System.out.println("Search 30: " + search(30));
        System.out.println("Search 100: " + search(100));

        // Maximum
        System.out.println("Maximum: " + findMaximum());

        // Middle
        System.out.println("Middle: " + findMiddle());

        // Insert at beginning
        insertBeginning(5);

        System.out.println("After inserting 5 at beginning:");
        printList();

        // Delete
        delete(30);

        System.out.println("After deleting 30:");
        printList();

        // Reverse print
        System.out.print("Reverse printing: ");
        reversePrint(head);
        System.out.println();

        // Josephus
        int n = 7;
        int k = 3;

        System.out.println(
            "Josephus winner: " + josephus(n, k)
        );
    }
}