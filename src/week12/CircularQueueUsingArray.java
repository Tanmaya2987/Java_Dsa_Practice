package week12;

public class CircularQueueUsingArray {
	int[] queue ;
	int size ;
	int front;
	int rear;
	
	public CircularQueueUsingArray(int size) {
		this.size=size;
		queue = new int[size];
		front= -1;
		rear = -1;
	}
	
	void enqueue(int x) {
		if((rear+1)%size == front) {
			System.out.println("queue overflow");
			return;
		}
		if(front==-1) {
			front =0;
		}
		rear = (rear+1)%size;
		queue[rear] = x;
	}
	
	int dequeue() {
		if(front == -1) {
			System.out.println("queue underflow");
			return -1;
		}
		int removed = queue[front];
		if(front == rear) {
			front=rear= -1;
		}else {
			front = (front+1)%size;
		}
		return removed;
	}
	
	int peek() {
		if(front == -1) {
			System.out.println("queue underflow");
			return -1;
		}
		return queue[front];
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	boolean isFull() {
		return (rear+1)%size == front;
	}
	
	void display() {
		if(front == -1) {
			System.out.println("queue underflow");
			return;
		}
		int i = front;
		while(true) {
			System.out.print(queue[i] +" ");
			if(i==rear) {
				break;
			}
			i= (i+1)%size;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueUsingArray cq = new CircularQueueUsingArray(5);
		cq.display();
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		cq.display();
		System.out.println("removed : "+cq.dequeue());
		System.out.println("removed : "+cq.dequeue());
		System.out.println("removed : "+cq.dequeue());
		cq.enqueue(60);
		cq.enqueue(70);
		cq.enqueue(80);
		cq.display();

	}

}
