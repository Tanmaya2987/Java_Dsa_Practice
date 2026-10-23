// creating a tree and printing it's nodes in level order

package week14;
import java.util.*;

//class Node{
//	int data;
//	Node left;
//	Node right;
//	
//	public Node(int data) {
//		this.data = data;
//		this.left = null;
//		this.right = null;
//	}
//}
public class Tree {
	
	public static void levelOrder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
		
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left= new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		levelOrder(root);

		

	}

}
