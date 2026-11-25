package week15.heap;

import java.util.*;

public class LC502 {
	public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

		// Min Heap based on required capital
		PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

		// Max Heap based on profit
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < profits.length; i++) {

			minHeap.add(new int[] { capital[i], profits[i] });
		}

		for (int i = 0; i < k; i++) {

			// Add affordable projects
			while (!minHeap.isEmpty() && minHeap.peek()[0] <= w) {

				maxHeap.add(minHeap.poll()[1]);
			}

			// No affordable project
			if (maxHeap.isEmpty()) {
				break;
			}

			// Select maximum profit
			w += maxHeap.poll();
		}

		return w;
	}

	public static void main(String[] args) {

		int k = 2;
		int w = 0;

		int[] profits = { 1, 2, 3 };
		int[] capital = { 0, 1, 1 };

		System.out.println("Maximum Capital: " + findMaximizedCapital(k, w, profits, capital));
	}

}
