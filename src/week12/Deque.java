package week12;
// using circular array
public class Deque {
	int[] deque;
	int count;
	int front;
	int rear;
	int size;
	
	public Deque(int size) {
		this.size = size;
		deque = new int[size];
		front = -1;
		rear = -1;
		count = 0;
	}
	
	boolean isFull() {
		return count == size;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	void insertRear(int x) {
		if(isFull()) {
			System.out.println("queue overflow");
			return;
		}
		if(isEmpty()) {
			front = rear =0;
		}else {
		  rear = (rear+1)%size ;
		}
		deque[rear]=x;
		count++;
	}
	
	int deleteFront() {
		if(isEmpty()) {
			System.out.println("underflow");
			return -1;
		}
		int removed = deque[front];
		if(count == 1) {
			front = rear = -1;
		}else {
			front = (front+1)%size;
		}
		count--;
		return removed;
	}
	
	void insertFront(int x) {
		if(isFull()) {
			System.out.println("overflow");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
		}else {
			front = (front -1 +size)%size;
		}
		deque[front] = x;
		count++;
	}
	
	int deleteRear() {
		if(isEmpty()) {
			System.out.println("underflow");
			return -1;
		}
		int removed = deque[rear];
		if(count == 1) {
			front = rear = -1;
		}else {
			rear =(rear -1 + size)%size;
		}
		count--;
		return removed;
	}
	
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return deque[front];
	}
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return deque[rear];
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("underflow");
			return;
		}
		int i = front;
		for(int j=0;j<count;j++) {
			System.out.print(deque[i] + " ");
			i =(i+1)%size;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque d = new Deque(5);
		d.insertRear(10);
		d.insertRear(20);
		d.insertFront(5);
		d.insertFront(1);
		d.display();
		System.out.println("front element is "+d.getFront());
		System.out.println("rear element is "+d.getRear());
		System.out.println("delete front : "+d.deleteFront());
		System.out.println("delete rear : "+d.deleteRear());
		d.display();
		System.out.println("front element is "+d.getFront());
		System.out.println("rear element is "+d.getRear());
		d.insertRear(100);
		d.insertFront(200);
		d.display();
		
		

	}

}
