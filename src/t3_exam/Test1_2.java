package t3_exam;

import java.util.Iterator;
import java.util.Scanner;

//최대/최소값 구하기 단 입력된 데이터 10건울 출력하고 최대 최소값을 구하시오.(2자리 이하의 정수가 입력된다.)
public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99;
		int num, cnt = 0;
		int[] arr = new int[200]; // 배열의 단점 사용하지 않는 것도 크기를 지정해 줘야함 <-메모리 낭비

		while (true) {
			System.out.print("정수를 입력하세요:(종료: 999)");
			num = sc.nextInt();
			if (num == 999)
				break;

			arr[cnt] = num;
			cnt++;

			if (num > max) max = num;
			if (num < min) min = num;

		}
		for (int i = 0; i < cnt; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);			
		}
		System.out.println();
		
		System.out.println("최대값:" + max + ", 최소값:" + min);

		sc.close();
	}
}
