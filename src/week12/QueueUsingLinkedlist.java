package week12;

public class QueueUsingLinkedlist {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node front;
	Node rear;
	public QueueUsingLinkedlist() {
		front = rear = null;
	}
	
	void enqueue(int x) {
		Node newnode = new Node(x);
		if(rear == null) {
			front = rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	int dequeue() {
		if(front == null) {
			System.out.println("queue underflow");
			return -1;
		}
		int removed = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return removed;
	}
	
	int peek() {
		if(front == null) {
			System.out.println("queue underflow");
			return -1;
		}
		return front.data;
	}
	
	boolean isempty() {
		return front == null;
	}
	
	void display() {
		if(front == null) {
			System.out.println("queue underflow");
			return;
		}
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedlist q = new QueueUsingLinkedlist();
		q.dequeue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println("deleted : "+q.dequeue());
		System.out.println("top : "+q.peek());
		q.display();

	}

}
