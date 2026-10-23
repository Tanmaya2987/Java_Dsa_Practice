//calculating the height of binary tree
//The height of a binary tree is the length of the longest path from the root node to any leaf node.
//here the height of tree is based on edges , to calculate based on nodes change the return to 0 in base case.

package week14;

public class HeightOfTree {

	public static int height(Node root) {
		if(root ==null) {
			return -1;
		}
		int l = height(root.left);
		int r = height(root.right);
		return 1+Math.max(l, r);
	}
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left= new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println("height of tree : "+ height(root));

	}

}
