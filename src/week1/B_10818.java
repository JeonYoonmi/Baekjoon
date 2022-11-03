package week1;

import java.util.Scanner;

/*
	- N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	
	* 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
	* 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
	* 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	
	- 예제
		5
		20 10 35 30 7
		
	- 예제 출력
		7 35
*/

public class B_10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		String num = scan.nextLine();
		String[] numarr = num.split(" ");
		
		int max = Integer.parseInt(numarr[0]);
		int min = Integer.parseInt(numarr[0]);
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(numarr[i]);
			if(max < n) max = n;
			if(min > n) min = n;
		}
		System.out.println(min + " " + max);
	}
}
