package week1;

import java.util.Scanner;

public class B_02739 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}
