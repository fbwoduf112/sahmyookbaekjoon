package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q11652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Map<Long, Integer> map = new HashMap<>();
		long max=0;
		for(int i=0; i<num; i++) {
			long str = Long.parseLong(br.readLine());
			map.put(str, map.getOrDefault(str, 0) + 1);
			max = Math.max(max, map.get(str));
			
		}
		List<Long> list = new ArrayList<>();
	    
		for(Entry<Long, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) list.add(entry.getKey());
		}
	    Collections.sort(list);
	    System.out.print(list.get(0));
	    
		
	}
}
	
	

