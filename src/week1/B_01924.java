package week1;

import java.util.Scanner;

public class B_01924 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		for(int i=1; i<month; i++) {
			switch (i) {
				case 2:
					day += 28;
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					day += 30;
					break;
					
				default:
					day += 31;
					break;
			}
		}
		
		String dayOfWeek = "";
		
		switch (day%7) {
		case 1:
			dayOfWeek = "MON";
			break;

		case 2:
			dayOfWeek = "TUE";
			break;
			
		case 3:
			dayOfWeek = "WED";
			break;
			
		case 4:
			dayOfWeek = "THU";
			break;
			
		case 5:
			dayOfWeek = "FRI";
			break;
			
		case 6:
			dayOfWeek = "SAT";
			break;
			
		default:
			dayOfWeek = "SUN";
			break;
		}
		
		
		System.out.println(dayOfWeek);
	}
}
