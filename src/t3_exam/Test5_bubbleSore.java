package t3_exam;

public class Test5_bubbleSore {
	public static void main(String[] args) {
		int[] m = {5,2,6,7,9,8};
		int temp = 0;
		
		System.out.print("원본자료 : ");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] +" ");
		}
		System.out.println();
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-i-1; j++) {
				if(m[j] > m[j+1]) {
					temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
			}
		}
		
		System.out.print("정렬자료 : ");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] +" ");
		}
		
	}
}
