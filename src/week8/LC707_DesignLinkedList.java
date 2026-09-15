package week8;

public class LC707_DesignLinkedList {

    static class MyLinkedList {

        static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        Node head;
        int size;

        MyLinkedList() {
            head = null;
            size = 0;
        }

        int get(int index) {

            if (index < 0 || index >= size) {
                return -1;
            }

            Node current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.val;
        }

        void addAtHead(int val) {

            Node newNode = new Node(val);

            newNode.next = head;
            head = newNode;

            size++;
        }

        void addAtTail(int val) {

            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                size++;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;

            size++;
        }

        void addAtIndex(int index, int val) {

            if (index < 0 || index > size) {
                return;
            }

            if (index == 0) {
                addAtHead(val);
                return;
            }

            Node newNode = new Node(val);

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;

            size++;
        }

        void deleteAtIndex(int index) {

            if (index < 0 || index >= size) {
                return;
            }

            if (index == 0) {
                head = head.next;
                size--;
                return;
            }

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;

            size--;
        }

        void print() {

            Node current = head;

            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }

            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.addAtHead(10);
        list.addAtTail(30);
        list.addAtIndex(1, 20);

        list.print();

        System.out.println("Value at index 1: " + list.get(1));

        list.deleteAtIndex(1);

        list.print();
    }
}