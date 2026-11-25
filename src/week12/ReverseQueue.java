package week12;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseQueue {
	static void reverse(Queue<Integer> q) {
		Stack<Integer> st = new Stack<>();
		while(!q.isEmpty()) {
			st.push(q.poll());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q =  new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		reverse(q);
		System.out.println(q);
		

	}

}
