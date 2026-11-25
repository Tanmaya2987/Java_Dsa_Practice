package week14;

import java.util.*;

public class ZigZagTraversal {

	static class Node {

		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	public static List<List<Integer>> zigzagTraversal(Node root) {

		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		boolean leftToRight = true;

		while (!queue.isEmpty()) {

			int size = queue.size();

			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				Node current = queue.poll();

				level.add(current.data);

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
			}

			if (!leftToRight) {
				Collections.reverse(level);
			}

			result.add(level);

			leftToRight = !leftToRight;
		}

		return result;
	}

	public static void main(String[] args) {

		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println("ZigZag Traversal: " + zigzagTraversal(root));
	}
}
