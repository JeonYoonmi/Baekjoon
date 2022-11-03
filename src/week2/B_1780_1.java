package week2;

import java.util.Scanner;

public class B_1780_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = Integer.parseInt(scan.nextLine());

		String[][] arrs = new String[size][size];

		int idx = 0;
		for (int i = 0; i < size; i++) {
			
		}
		
		
		int n = 0;
		int[] res = new int[3];
		wh : while (true) {
			if(n == size) break;

			System.out.println(1);
			Loop1: for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (arrs[0][0] == arrs[i][j])
						break Loop1;
					else {
						if (arrs[0][0].equals("-1")) {
							res[0] = 1;
						} else if (arrs[0][0].equals("0")) {
							res[1] = 1;
						} else {
							res[2] = 1;
						}
						break wh;
					}
				}
			}
			Loop: for (int i = n; i < n + size / 3; i++) {
				for (int j = n; j < n + size / 3; j++) {
					if (arrs[n][n] == arrs[i][j]) {
						if (arrs[n][n].equals("-1")) {
							res[0] += 1;
						} else if (arrs[n][n].equals("0")) {
							res[1] += 1;
						} else {
							res[2] += 1;
						}
						break Loop;
					} else {
						break Loop;
					}
				}
			}
		}

		for (int i : res) {
			System.out.println(i);
		}

	}
}
