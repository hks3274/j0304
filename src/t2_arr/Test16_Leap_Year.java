package t2_arr;

import java.util.Scanner;

public class Test16_Leap_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요? ");
		int year = sc.nextInt();
		
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 ) {
			System.out.println(year + "은 윤년입니다");
		} 
		else System.out.println(year + "은 평년입니다");
		
		sc.close();
	}
}
