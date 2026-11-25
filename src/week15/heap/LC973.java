package week15.heap;

import java.util.*;

public class LC973 {
	public static int[][] kClosest(int[][] points, int k) {

		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Long.compare(distance(b), distance(a)));

		for (int[] point : points) {

			pq.add(point);

			if (pq.size() > k) {
				pq.poll();
			}
		}

		int[][] result = new int[k][2];

		for (int i = 0; i < k; i++) {
			result[i] = pq.poll();
		}

		return result;
	}

	public static long distance(int[] point) {

		return (long) point[0] * point[0] + (long) point[1] * point[1];
	}

	public static void main(String[] args) {

		int[][] points = { { 1, 3 }, { -2, 2 } };

		int k = 1;

		int[][] result = kClosest(points, k);

		System.out.println("K Closest Points:");

		for (int[] point : result) {
			System.out.println(Arrays.toString(point));
		}
	}

}
