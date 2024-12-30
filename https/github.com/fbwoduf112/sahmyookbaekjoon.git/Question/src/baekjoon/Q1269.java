package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			map.put(Integer.parseInt(st.nextToken()), 0);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			if(map.containsKey(Integer.parseInt(st.nextToken()))) cnt++;			
		}
		System.out.println(n + m - cnt*2);
	}
}
