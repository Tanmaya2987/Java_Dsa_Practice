package week14;

import java.util.*;
//leetcode 105

public class ConstructBinaryTree {

	static class TreeNode {

		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	static int preorderIndex = 0;

	static HashMap<Integer, Integer> inorderMap = new HashMap<>();

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		preorderIndex = 0;
		inorderMap.clear();

		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		return build(preorder, 0, inorder.length - 1);
	}

	public static TreeNode build(int[] preorder, int left, int right) {

		if (left > right) {
			return null;
		}

		int value = preorder[preorderIndex++];

		TreeNode root = new TreeNode(value);

		int mid = inorderMap.get(value);

		root.left = build(preorder, left, mid - 1);

		root.right = build(preorder, mid + 1, right);

		return root;
	}

	public static void printInorder(TreeNode root) {

		if (root == null) {
			return;
		}

		printInorder(root.left);

		System.out.print(root.val + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) {

		int[] preorder = { 3, 9, 20, 15, 7 };

		int[] inorder = { 9, 3, 15, 20, 7 };

		TreeNode root = buildTree(preorder, inorder);

		System.out.print("Constructed Tree Inorder: ");

		printInorder(root);
	}
}
