package week1;

import java.util.Scanner;

public class B_02522 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		String res = "";
		String stars = "";
		for(int i=1; i<=T; i++) {
			for(int k=0; k<T-i; k++) {
				stars += " ";
			}
			for(int j=0; j<i; j++) {
				stars += "*";
			}
			res += stars + "\n";
			stars = "";
		}
		for(int i=T-1; i>0; i--) {
			for(int k=0; k<T-i; k++) {
				stars += " ";
			}
			for(int j=0; j<i; j++) {
				stars += "*";
			}
			res += stars + "\n";
			stars = "";
		}
		
		System.out.println(res);
	}
}
