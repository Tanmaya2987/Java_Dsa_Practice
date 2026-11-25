package week12;
// using an unsorted array
public class MinPriority {
	static int[] values = new int[5];
	static int [] priority = new int[5];
	static int size =0;
	
	static void enqueue(int data, int p) {
		if(size == values.length) {
			System.out.println("overflow");
			return;
		}
		values[size]=data;
		priority[size]=p;
		size++;
	}
	
	static int dequeue() {
		if(size==0) {
			System.out.println("underflow");
			return -1;
		}
		int minindex = 0;
		for(int i=1;i<size;i++) {
			if(priority[i]<priority[minindex]) {
				minindex=i;
			}
		}
		int removed = values[minindex];
		values[minindex]=values[size-1];
		priority[minindex]=priority[size-1];
		size--;
		return removed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  enqueue(100, 3);
	      enqueue(200, 1);
	      enqueue(300, 2);

	        System.out.println(dequeue()); // 200
	        System.out.println(dequeue()); // 300
	        System.out.println(dequeue()); // 

	}

}
