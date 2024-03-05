package t2_arr;

//배열복사: system.arrayCopy(원본배열명, 원본배열시작인덱스, 타겟배열며으 타겟배열시작인덱스, 복사할원소갯수)
public class Test17_arrayCopy {
	public static void main(String[] args) {
		int[] su1 = {1,3,5,7,9};
		int[] su2 = new int[su1.length];
		
		
		//배열복사(system.arrayCopy())
		System.arraycopy(su1, 0, su2, 0, su1.length);
	
		
		//su1배열 출력
		System.out.println("su1 : ");
		for (int i = 0; i < su1.length; i++) {
			System.out.print( su1[i] + "/");
		}
		System.out.println();
		
		
		//su2 배열 출력
		System.out.println("su2 : ");
		for (int i = 0; i < su2.length; i++) {
			System.out.print( su2[i] + "/");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.println("==============================================");
		
		 su2[3] = 500; 
		
		//su1배열 출력
			System.out.println("su1 : ");
			for (int i = 0; i < su1.length; i++) {
				System.out.print( su1[i] + "/");
			}
			System.out.println();
			
			
			//su2 배열 출력
			System.out.println("su2 : ");
			for (int i = 0; i < su2.length; i++) {
				System.out.print( su2[i] + "/");
			}
			System.out.println();
		
		//깊은 복사이다. 수를 전부다 가져와서 넣은 것 
			// 얕은 복사는 주소를 가져오는 것
	}
}
