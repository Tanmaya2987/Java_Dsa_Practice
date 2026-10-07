package week11;

import java.util.*;

public class Stack {
	
	int[] arr;
	int top;
	Stack(int size){
		arr = new int[size];
		top= -1;
	}
	
	void push(int value) {
		if(top== arr.length-1) {
			System.out.println("stack overflow");
			return;
		}
		arr[++top]=value;
	}
	
	int pop() {
		if(top== -1) {
			System.out.println("stack underflow");
			return -1;
		}
		return arr[top--];
		
	}
	
	int peek() {
		if(top==-1) {
			return -1;
		}
		return arr[top];
	}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(arr[top] + " ");
			
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
	Stack st = new Stack(5);
	st.push(10);
	st.push(10);
	st.push(10);
	st.push(10);
	st.push(10);
	st.display();
	System.out.println("popped "+ st.pop());
	st.display();
	System.out.println("top "+st.peek());
	

	}

}
