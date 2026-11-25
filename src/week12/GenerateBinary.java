package week12;
import java.util.*;

import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinary {
	
	static void binary(int n) {
		Queue<String> q = new LinkedList<>();
		q.add("1");
		for(int i=0;i<n;i++) {
			String s= q.poll();
		    System.out.print(s + " ");
		    q.add(s + "0");
		    q.add(s + "1");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        binary(5);
	}

}
