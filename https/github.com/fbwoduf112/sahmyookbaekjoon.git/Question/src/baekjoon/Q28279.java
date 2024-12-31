package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		LinkedList <Integer> array = new LinkedList<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int key;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str) {
			case "1":
				key = Integer.parseInt(st.nextToken());
				array.addFirst(key);
				break;
			case "2":
				key = Integer.parseInt(st.nextToken());
				array.add(key);
				break;
			case "3":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.removeFirst()).append('\n');
				break;
			case "4":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.removeLast()).append('\n');
				break;
			case "5":
				sb.append(array.size()).append('\n');
				break;
			case "6":
				if(array.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "7":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.getFirst()).append('\n');
				break;
			case "8":
				if(array.isEmpty()) sb.append(-1).append('\n');
				else sb.append(array.getLast()).append('\n');
				break;
			
			}
		}
		br.close();
		System.out.print(sb);
	}
}
