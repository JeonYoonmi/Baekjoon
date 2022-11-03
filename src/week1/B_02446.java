package week1;

import java.util.Scanner;

public class B_02446 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		String res = "";
		String stars = "";
		for(int i=T; i>0; i--) {
			for(int k=0; k<T-i; k++) {
				stars += " ";
			}
			for(int j=0; j<i+i-1; j++) {
				stars += "*";
			}
			res += stars + "\n";
			stars = "";
		}
		for(int i=2; i<=T; i++) {
			for(int k=0; k<T-i; k++) {
				stars += " ";
			}
			for(int j=0; j<i+i-1; j++) {
				stars += "*";
			}
			res += stars + "\n";
			stars = "";
		}
		
		System.out.println(res);
	}
}
