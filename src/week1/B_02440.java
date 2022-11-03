package week1;

import java.util.Scanner;

public class B_02440 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		String res = "";
		String stars = "";
		for(int i=T; i>0; i--) {
			for(int j=0; j<i; j++) {
				stars += "*";
			}
			res += stars + "\n";
			stars = "";
		}
		
		System.out.println(res);
	}
}
