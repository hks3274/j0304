package t2_arr;

import java.util.Iterator;
import java.util.Scanner;

//2차원 배열에 입력된 값 주입하기
//입력자료 : 3명 학생의 번호, 국어, 영어, 수학, 점수가 입력된다. 입력된 값들을 모두 출력하세요.
public class Test14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];
		String[] title = {"번호","국어점수","영어점수","수학점수"};
		
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < title.length; j++) {
				System.out.print(i+". "+title[j]+"를 입력하세요");
				arr[i][j] = sc.nextInt();
			}
		}
		
//		System.out.println("번호, 국어, 영어, 수학 점수를 차례로 입력하세요(종료:999)");
		
		System.out.println("* 출력값 *");
		System.out.println("번호\t국어\t영어\t수학");
		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < title.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			 System.out.println();
		}
		
		
		
		sc.close();
		
		
	}
}
