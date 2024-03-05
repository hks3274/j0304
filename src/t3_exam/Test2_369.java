package t3_exam;

import java.util.Iterator;

//배열을 이용한 369게임
/*
 * 1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)
 */
public class Test2_369 {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw = 0;
		String temp;

		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) + ""; // Interger.toString() -> 래퍼클래스 -> 더 복잡하게 사용하자
			temp = "";
			sw = 0;

			for (int j = 0; j < num[i].length(); j++) {
				if (num[i].charAt(j) == '3' || num[i].charAt(j) == '6' || num[i].charAt(j) == '9') {
					temp += "짝";
					sw = 1;
				}
			}
			if (sw == 1) num[i] = temp;
		}
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			if ((i + 1) % 10 == 0) System.out.println();
		}

	}
}
