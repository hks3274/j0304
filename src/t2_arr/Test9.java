package t2_arr;

public class Test9 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];
		
		atom[0][1] = 10;
		atom[1][2] = 20;
		atom[2][0] = 30;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(atom[i][j] +" / ");
			}
			System.out.println();
		}
	}
}
