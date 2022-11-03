package week1;

import java.util.Scanner;

public class B_10992 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=1; i<T; i++) {
			for(int j=i; j<=T-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				if(j == 1||j == 2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=2*T-1; i++) {
			System.out.print("*");
		}
	}
}
