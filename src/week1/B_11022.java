package week1;

import java.util.Scanner;

public class B_11022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String T = scan.nextLine();
		
		for(int i=0; i<Integer.parseInt(T); i++) {
			String nums = scan.nextLine();
			
			String[] numarr = nums.split(" ");

			int a = Integer.parseInt(numarr[0]);
			int b = Integer.parseInt(numarr[1]);
			
			System.out.println("Case #"+ (i+1) + ": " + a + " + " + b + " = " + (a+b));
		}
		
	}
}
