package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, m;
		n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap <Integer, Integer> (n);
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int key;
		
		for(int i=0; i<n; i++) {
			key = Integer.parseInt(st.nextToken());
			hm.put(key, hm.getOrDefault(key, 0) + 1);
		}
		
		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			key = Integer.parseInt(st.nextToken());
			sb.append(hm.getOrDefault(key, 0) + " ");
		}
		
		
	
		
	}
}
