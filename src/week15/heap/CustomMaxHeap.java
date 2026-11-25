package week15.heap;

public class CustomMaxHeap {

    private int[] heap;
    private int size;
    private int capacity;

    public CustomMaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Insert element
    public void insert(int value) {

        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;

        int current = size;
        size++;

        // Heapify up
        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[current] > heap[parent]) {

                int temp = heap[current];
                heap[current] = heap[parent];
                heap[parent] = temp;

                current = parent;
            } else {
                break;
            }
        }
    }

    // Remove maximum element
    public int extractMax() {

        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return max;
    }

    // Heapify down
    private void heapifyDown(int index) {

        while (true) {

            int largest = index;

            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest == index) {
                break;
            }

            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            index = largest;
        }
    }

    // Display heap
    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CustomMaxHeap h = new CustomMaxHeap(10);

        h.insert(40);
        h.insert(20);
        h.insert(50);
        h.insert(10);
        h.insert(30);

        System.out.print("Max Heap: ");
        h.display();

        System.out.println("Extracted Maximum: " + h.extractMax());

        System.out.print("After Deletion: ");
        h.display();
    }
}
