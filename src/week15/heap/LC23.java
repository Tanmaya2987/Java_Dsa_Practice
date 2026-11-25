package week15.heap;

import java.util.*;

public class LC23 {
	static class ListNode {

		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode mergeKLists(ListNode[] lists) {

		PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

		// Add first node of each list
		for (ListNode node : lists) {

			if (node != null) {
				pq.add(node);
			}
		}

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		while (!pq.isEmpty()) {

			ListNode smallest = pq.poll();

			current.next = smallest;
			current = current.next;

			if (smallest.next != null) {
				pq.add(smallest.next);
			}
		}

		current.next = null;

		return dummy.next;
	}

	// Create linked list
	public static ListNode createList(int[] arr) {

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		for (int value : arr) {

			current.next = new ListNode(value);
			current = current.next;
		}

		return dummy.next;
	}

	// Display linked list
	public static void display(ListNode head) {

		while (head != null) {

			System.out.print(head.val);

			if (head.next != null) {
				System.out.print(" -> ");
			}

			head = head.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		ListNode[] lists = { createList(new int[] { 1, 4, 5 }), createList(new int[] { 1, 3, 4 }),
				createList(new int[] { 2, 6 }) };

		ListNode result = mergeKLists(lists);

		System.out.println("Merged Sorted List:");

		display(result);
	}

}
