package week10;

public class LC1721_SwappingNodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        // Find kth node from beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode kthFromBeginning = first;

        // Find kth node from end
        ListNode second = head;
        ListNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // Swap values
        int value = kthFromBeginning.val;
        kthFromBeginning.val = second.val;
        second.val = value;

        return head;
    }

    static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = swapNodes(head, 2);

        print(head);
    }
}