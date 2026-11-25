package week12;
import java.util.*;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class FirstNonRepeat {
	static void solve(String s) {
		Queue<Character> q = new LinkedList<>();
		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			freq[ch-'a']++;
			q.add(ch);
			while(!q.isEmpty() && freq[q.peek()-'a']>1) {
				q.poll();
			}
			if(q.isEmpty()) {
				System.out.print("# ");
			}else {
				System.out.print(q.peek() + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aabc";
		solve(s);

	}

}
