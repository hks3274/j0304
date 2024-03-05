package t3_exam;

import java.util.Iterator;

public class Test4_selectSort {
	public static void main(String[] args) {
		int[] m = {5,2,6,7,9,8};
		int temp = 0;
		
		System.out.print("원본자료 : ");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] +" ");
		}
		System.out.println();
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = i+1; j < m.length; j++) {
				if(m[i] > m[j] ) {
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		
		System.out.print("정렬자료 : ");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] +" ");
		}
		
		
	}
}
