package t2_arr;

import java.util.Iterator;

/*
  100 90 80 50
  80  50 90 100
  90 10 20 90
 */

public class Test10 {
	public static void main(String[] args) {
		int[][] atom = {{100,90,80,50},
										{80,50,90,100},
										{90,10,20,90}};
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4 ; j++) {
				System.out.print(atom[i][j] +"/ ");
			}
			System.out.println();
		}
	
	}
}
