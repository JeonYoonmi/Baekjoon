package week1;

import java.util.Scanner;

public class B_11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String content = scan.nextLine();

		int cnt = 0;
		String subcontent = "";
		for(int i=0; i<content.length(); i++) {
			cnt++;
			subcontent += content.substring(i, i+1);
			
			if(cnt % 10 == 0 || i == content.length()-1) {
				System.out.println(subcontent);
				subcontent = "";
			}
		}
		
		System.out.println();
	}
}
