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
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		Stack <Integer> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 1;
		
		// while문과 다른 결과
		/*
		for(int i=0; i<n; i++) {
			if(queue.peek() != cnt) 
				stack.add(queue.poll());
			else {
				queue.poll();
				cnt++;
			}
		}
*/
		 while (!queue.isEmpty()) {
			    if (queue.peek() == cnt) { // 순서가 맞으면 통과
			        queue.poll();
			        cnt++;
			    } else if (!stack.isEmpty() && stack.peek() == cnt) { // 스택에서 꺼내서 통과
			        stack.pop();
			        cnt++;
			    } else { // 대기열로 이동
			        stack.add(queue.poll());
			    }
			}
		
		for(int i=cnt; i<=n; i++) {
			if(stack.pop() != cnt) {
				break;
			}
			else cnt++;
		}
		if(stack.isEmpty()) {
			System.out.print("Nice");
		} else {
			System.out.print("Sad");
		}
	}
}
	
	

