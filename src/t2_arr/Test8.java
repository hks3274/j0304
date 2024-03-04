package t2_arr;

import java.util.Iterator;

/*
  1 2  3  4
  5 6  7  8
  9 10 11 12
 */

public class Test8 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];
		int num = 5;
		//값 기억시키기
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4 ; j++) {
				num--;
				atom[i][j] = num; 
			}
			num += 8;
		}
		
		
		//배열에 저장된 형태 그대로 출려하기
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(atom[i][j] +" / ");
			}
			System.out.println();
		}
	}
}
