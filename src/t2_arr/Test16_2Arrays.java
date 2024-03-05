package t2_arr;

import java.util.Iterator;

/*
 * 번호  성명  국어  영어  수학  총점  평균  학점  순위
 * 1   홍길동 100  90   80  270  90   A   1
 * 2   김__   .   .    .    .    .   .   3
 * .    . .  ..  ..  ..    ...   ..  .  ..
 */

//1,2차 배열 섞어서 하기 
//100명 이내의 학생이 입력한다.

import java.util.Scanner;

public class Test16_2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//작업에 필요한 변수 정의 하기
		String[] name = new String[100];
		int[][] jumsu = new int[100][4];
		double[] avg = new double[100];
		char[] grade = new char[100];
		int cnt = 0, tot = 0, total = 0;
		String[] title = {"성명", "국어", "영어", "수학", "총점", "평균", "학점"};
		
		//학생 자료 입력처리
		for (int i = 0; i < name.length; i++) {
			System.out.print("학생 이름을 입력하세요?(종료시는 999)==> ");
			name[i] = sc.next();
			if(name[i].equals("999")) break;
			
			
			for (int j = 0; j < 3; j++) {
				System.out.print(title[j+1] + "점수를 입력하세요?");
				jumsu[i][j] = sc.nextInt();
				tot += jumsu[i][j];
			}
			
			jumsu[i][3] = tot; 
			avg[i] = tot/3.0;
			
			if(avg[i] >=90) grade[i] = 'A';
			else if(avg[i] >=80) grade[i] = 'B';
			else if(avg[i] >=70) grade[i] = 'C';
			else if(avg[i] >=60) grade[i] = 'D';
			else grade[i] = 'F';
			
			total += tot;
			tot = 0; // clear 해주는거 중요(*)
			cnt++;
		}
		
		//입력한 학생 자료와 계산된 값을 출력처리
		System.out.println("\n\t\t\t*** 성적표 ***");
		System.out.println("================================================================");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < cnt; i++) {
			System.out.print((i+1) + "\t" + name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.printf("%.2f\t %c\n", avg[i], grade[i]);
		}	
		System.out.printf("\t\t\t 총 평균 %.2f, 인원수:%d\n", (double)(total/cnt/3),cnt);
		System.out.println("----------------------------------------------------------------");
		sc.close();
	}
}
