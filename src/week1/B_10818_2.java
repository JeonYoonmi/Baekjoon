package week1;

import java.util.Arrays;
import java.util.Scanner;

public class B_10818_2 {
   public static void main(String[] args) {
    
      Scanner in = new Scanner(System.in);
        
      int N = in.nextInt();
      int[] arr = new int[N];
        
      for (int i = 0; i < N; i++) {
         arr[i] = in.nextInt();
      }
        
      in.close();
      Arrays.sort(arr);
      System.out.print(arr[0] + " " + arr[N - 1]);
   }
}
