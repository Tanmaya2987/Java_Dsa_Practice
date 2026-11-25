package week14;

import java.util.*;

//leetcode 144
public class PreorderTraversal {

	static class TreeNode {

		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();

		preorder(root, result);

		return result;
	}

	public static void preorder(TreeNode root, List<Integer> result) {

		if (root == null) {
			return;
		}

		result.add(root.val);

		preorder(root.left, result);

		preorder(root.right, result);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		System.out.println("Preorder Traversal: " + preorderTraversal(root));
	}
}
