package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		HashMap <String, String> hm = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length()+1; j++) {
				hm.put(str.substring(i, j), str);
			}
		}
		
		int cnt = hm.size();
		System.out.println(cnt);
		
	}
}
	
	

