package t2_arr;

//배열의 복사 (깊은 복사, 얕은 복사)
public class Test13 {
	public static void main(String[] args) {
		int[] su1 = { 1, 2, 3, 4, 5 };
		int[] su2 = new int[su1.length];

		System.out.println("su1배열 :");
		for (int i = 0; i < su1.length; i++) {
			System.out.println("su1[" + i + "] = " + su1[i]);
		}
		System.out.println("\n");

		System.out.println("su2배열 :");
		for (int i = 0; i < su2.length; i++) {
			System.out.println("su2[" + i + "] = " + su2[i]);
		}
		System.out.println("\n");
		
		
		//배열복사(__ 복사)
		for (int i = 0; i < su1.length; i++) {
			su2[i] = su1[i];
		}
		
		System.out.println("su2배열 :");
		for (int i = 0; i < su2.length; i++) {
			System.out.println("su2[" + i + "] = " + su2[i]);
		}
		System.out.println("\n");
		
		
	}
}
