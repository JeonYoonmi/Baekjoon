package week2;

import java.util.Scanner;

public class B_2875 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		int team = 0;
		
		while(n>=2 && m>=1 && n+m>=k+3) {
			n -= 2;
			m--;
			team++;
		}
		
		System.out.println(team);
	}
}
