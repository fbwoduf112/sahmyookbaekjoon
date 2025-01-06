package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		for(int i=b.length()-1; i>=0; i--) {
			System.out.println(Integer.parseInt(a) * (b.charAt(i) - '0'));
		}
		System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
	}

}
