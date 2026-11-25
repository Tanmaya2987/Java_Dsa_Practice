package week16.graph;

import java.util.*;

public class LC1971_PathExist {
	public static boolean validPath(int n, int[][] edges, int source, int destination) {

		List<List<Integer>> graph = new ArrayList<>();

// Create adjacency list
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

// Add edges in both directions
		for (int[] edge : edges) {

			int u = edge[0];
			int v = edge[1];

			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		boolean[] visited = new boolean[n];

		return dfs(graph, visited, source, destination);
	}

	public static boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {

		if (current == destination) {
			return true;
		}

		visited[current] = true;

		for (int neighbor : graph.get(current)) {

			if (!visited[neighbor]) {

				if (dfs(graph, visited, neighbor, destination)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int n = 3;

		int[][] edges = { { 0, 1 }, { 1, 2 } };

		int source = 0;
		int destination = 2;

		System.out.println("Path Exists: " + validPath(n, edges, source, destination));
	}

}
