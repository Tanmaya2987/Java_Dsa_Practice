// checking if the given tree is a complete binary tree
//A binary tree is complete when:
//- Every level, except possibly the last, is completely filled.
//- The last level is filled from left to right, without gaps.

package week14;
import java.util.*;

public class CompleteBinaryT {
	
	public static boolean isComplete(Node root) {
		if(root==null)
			return true;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean found = false;
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr==null) {
				found =true;
			}else {
				if(found) {
					return false;
				}
				q.add(curr.left);
				q.add(curr.right);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left= new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println("binary tree is complete? :"+isComplete(root));

	}

}
