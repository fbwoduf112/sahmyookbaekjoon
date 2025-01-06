package baekjoon;

import java.io.*;
import java.util.*;
public class Q1913 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int arr[][] = new int [N][N];
		int x = N/2;
		int y = N/2;
		int k = 1;
		int cnt=1;
		int ccnt = 0;
		arr[x][y] = k;
		while(true) {
			
			if(ccnt % 2 ==0) {
				for(int i=0; i<cnt; i++) {
					if(k>=N*N) break;
					y--; k++;
					arr[y][x] = k;
					
				}
				
				for(int j=0; j<cnt; j++) {
					if(k>=N*N) break;

					x++; k++;
					arr[y][x] = k;
				}
				ccnt++;
			}
			
			else {
				for(int i=0; i<cnt; i++) {
					if(k>=N*N) break;

					y++; k++;
					arr[y][x] = k;
				}
				for(int i=0; i<cnt; i++) {
					if(k>=N*N) break;

					x--; k++;
					arr[y][x] = k;
				}
				ccnt++;
			}
			cnt++;
			if(k >= N*N) break;
			
		}
		arr[0][0] = N*N;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == M) System.out.print((i+1) +" "+ (j+1));
			}
			
		}		
		
	}
}
