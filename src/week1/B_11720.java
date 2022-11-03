package week1;

import java.util.Scanner;

public class B_11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String len = scan.nextLine();
		String nums = scan.nextLine();
		
		int sum = 0;
		for(int i=0; i<Integer.parseInt(len); i++) {
			sum += Integer.parseInt(nums.substring(i, i+1));
		}
		
		System.out.println(sum);
	}
}
