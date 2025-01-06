package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int x =1; int y = 1; int cnt = 1;
		int direct = 1;
		//1은 오른쪽 2 = 왼쪽 아래 3 = 아래 4는 오른쪽 위에
		while(true) {
			if(direct == 1) {
				x++; cnt++; direct = 2;
			}
			else if(direct == 2) {
				if(x == 1) direct = 3;
				else {x--; cnt++; y++;}
			}
			else if(direct == 3) {
				y++; cnt++; direct = 4;
			}
		
			else if(direct == 4) {
				if(y==1) direct = 1;
				else{y--; x++; cnt++;}
			}
			if(cnt == num) break;
		}
		
		System.out.print(y + "/" + x);
	}
}
