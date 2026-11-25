package week14;

import java.util.*;

public class BinaryTreeValidation {

	public static boolean validateBinaryTree(int n, int[] leftChild, int[] rightChild) {

		int[] indegree = new int[n];

		for (int i = 0; i < n; i++) {

			if (leftChild[i] != -1) {
				indegree[leftChild[i]]++;
			}

			if (rightChild[i] != -1) {
				indegree[rightChild[i]]++;
			}
		}

		int root = -1;
		int rootCount = 0;

		for (int i = 0; i < n; i++) {

			if (indegree[i] == 0) {
				root = i;
				rootCount++;
			}

			if (indegree[i] > 1) {
				return false;
			}
		}

		if (rootCount != 1) {
			return false;
		}

		boolean[] visited = new boolean[n];

		Queue<Integer> queue = new LinkedList<>();

		queue.add(root);
		visited[root] = true;

		int count = 0;

		while (!queue.isEmpty()) {

			int node = queue.poll();
			count++;

			int left = leftChild[node];
			int right = rightChild[node];

			if (left != -1) {

				if (visited[left]) {
					return false;
				}

				visited[left] = true;
				queue.add(left);
			}

			if (right != -1) {

				if (visited[right]) {
					return false;
				}

				visited[right] = true;
				queue.add(right);
			}
		}

		return count == n;
	}

	public static void main(String[] args) {

		int n = 4;

		int[] leftChild = { 1, -1, 3, -1 };
		int[] rightChild = { 2, -1, -1, -1 };

		System.out.println(validateBinaryTree(n, leftChild, rightChild));
	}
}
