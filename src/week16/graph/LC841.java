package week16.graph;
import java.util.*;

public class LC841 {
	 public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

	        int n = rooms.size();

	        boolean[] visited = new boolean[n];

	        dfs(rooms, visited, 0);

	        for (boolean visit : visited) {
	            if (!visit) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void dfs(List<List<Integer>> rooms,boolean[] visited, int room) {

	        visited[room] = true;

	        for (int key : rooms.get(room)) {

	            if (!visited[key]) {
	                dfs(rooms, visited, key);
	            }
	        }
	    }

	    public static void main(String[] args) {

	        List<List<Integer>> rooms = new ArrayList<>();

	        rooms.add(Arrays.asList(1));
	        rooms.add(Arrays.asList(2));
	        rooms.add(Arrays.asList(3));
	        rooms.add(new ArrayList<>());

	        System.out.println("Can Visit All Rooms: " + canVisitAllRooms(rooms));
	    }

}
