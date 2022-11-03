package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	# 정렬되어있는 두 배열 A와 B가 주어진다.
	# 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
	
	* 첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
	* 둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다.
	* 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
*/

public class B_11728 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<Integer>();
		
		String[] sizes = br.readLine().split(" ");
		
		int n = Integer.parseInt(sizes[0]);
		int m = Integer.parseInt(sizes[1]);
		
		String[] arrA = br.readLine().split(" ");
		String[] arrB = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(arrA[i]));
		}
		for(int i=0; i<m; i++) {
			list.add(Integer.parseInt(arrB[i]));
		}
		
		Collections.sort(list);
		
		for (int num : list) {
			bw.write(num + " ");
		}
		
		bw.close();
		br.close();
	}
}
