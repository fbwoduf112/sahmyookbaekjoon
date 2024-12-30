package baekjoon;

import java.util.Scanner;

public class Q9498 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
int grade;
grade = scan.nextInt();
if(0<= grade && grade <= 100) {
	if(grade >= 90)
		{System.out.print("A");}
	else if(grade >= 80)
		{System.out.print("B");}
	else if(grade >= 70)
		{System.out.print("C");}
	else if(grade >= 60)
		{System.out.print("D");}
	else
		{System.out.print("F");}

}
}
}