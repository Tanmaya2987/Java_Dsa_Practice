package week14;

import java.util.*;

//leetcode 145
public class PostorderTraversal {

	static class TreeNode {

		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();

		postorder(root, result);

		return result;
	}

	public static void postorder(TreeNode root, List<Integer> result) {

		if (root == null) {
			return;
		}

		postorder(root.left, result);

		postorder(root.right, result);

		result.add(root.val);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		System.out.println("Postorder Traversal: " + postorderTraversal(root));
	}
}
