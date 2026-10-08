package week12;
import java.util.*;

// Queue implementation using arrays

class Queue{
	int[] arr;
	int rear;
	int front;
	int size;
	
	public Queue(int size){
		this.size= size;
		arr=  new int[size];
		front = -1;
		rear = -1;		
	}
	
	void enqueue(int value) {
		if(rear==size-1) {
			System.out.println("queue overflow");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear++;
		arr[rear]=value;
		System.out.println( value + " inserted");
	}
	
	void dequeue(){
		if(front == -1 || front>rear) {
			System.out.println("queue underflow");
			return;
		}
		
		System.out.println(arr[front] + " removed");
		front++;
	}
	
	void peek() {
		if(front== -1 || front>rear) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("front element "+ arr[front]);
	}
	void display() {
		if(front== -1 || front>rear) {
			System.out.println("queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.peek();
//		leetcode 933, 1700, 2073
	}
}
