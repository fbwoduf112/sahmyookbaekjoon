package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		LinkedList <Integer> array = new LinkedList<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str) {
			case "push":
				int key = Integer.parseInt(st.nextToken());
				array.add(key);
				break;
			case "pop":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.removeFirst()).append('\n');
				break;
			case "size":
				sb.append(array.size()).append('\n');
				break;
			case "empty":
				if(array.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "front":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.getFirst()).append('\n');
				break;
			case "back":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.getLast()).append('\n');
				break;
			}
		}
		System.out.print(sb);
	}
}
