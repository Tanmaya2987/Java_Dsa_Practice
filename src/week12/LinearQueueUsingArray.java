package week12;

public class LinearQueueUsingArray {
	
	int[] queue ;
	int size;
	int front;
	int rear;
	
	public LinearQueueUsingArray(int size) {
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	void enqueue(int x) {
		if(rear == queue.length-1) {
			System.out.println("queue overflow");
			return;
		}
		if(front== -1) {
			front =0;
		}
		rear++;
		queue[rear]=x;
	}
	
	int dequeue() {
		if(front == -1) {
			System.out.println("queue is empty");
			return -1;
		}
		int removed = queue[front];
		if(front == rear) {
			front = -1;
			rear= -1;
		}else {
			front++;
		}
		return removed;
	}
	
	int peek() {
		if(front == -1) {
			System.out.println("queue is empty");
			return -1;
		}
		return queue[front];
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	boolean isFull() {
		return rear == queue.length-1;
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearQueueUsingArray q = new LinearQueueUsingArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.display();
		System.out.println("front element is : " + q.peek());

	}

}
