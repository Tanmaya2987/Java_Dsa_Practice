package week15.heap;

import java.util.*;

public class LC621 {

	public static int leastInterval(char[] tasks, int n) {

		int[] freq = new int[26];

		for (char task : tasks) {
			freq[task - 'A']++;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int count : freq) {
			if (count > 0) {
				pq.add(count);
			}
		}

		int time = 0;

		while (!pq.isEmpty()) {

			List<Integer> temp = new ArrayList<>();

			int cycle = n + 1;

			for (int i = 0; i < cycle; i++) {

				if (!pq.isEmpty()) {

					int count = pq.poll();

					count--;

					if (count > 0) {
						temp.add(count);
					}

					time++;
				} else {
					if (temp.isEmpty()) {
						break;
					}

					time++;
				}
			}

			for (int count : temp) {
				pq.add(count);
			}
		}

		return time;
	}

	public static void main(String[] args) {

		char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };

		int n = 2;

		System.out.println("Minimum Intervals: " + leastInterval(tasks, n));
	}
}
