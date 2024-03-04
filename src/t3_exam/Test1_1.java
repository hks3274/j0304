package t3_exam;

import java.util.Scanner;

//최대/최소값 구하기 단 입력된 데이터 10건울 출력하고 최대 최소값을 구하시오.(2자리 이하의 정수가 입력된다.)
public class Test1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99;
		int num;
		
		while(true) {
			System.out.print("정수를 입력하세요:(종료: 999)");
			num = sc.nextInt();
			if(num == 999) break;
			
			if(num > max) max = num;
			if(num < min) min = num;
			
		}
		
		System.out.println("최대값:"+max+", 최소값:"+min);
		
		sc.close();
	}
}
