package t2_arr;

public class Test16_Rank1 {
	public static void main(String[] args) {
		int[] su = {90,70,100,90,60};
		int[] rank = new int[su.length];
		
		// 순위구하기
		for (int i = 0; i < su.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < su.length; j++) {
				if(su[i] < su[j]) rank[i]++; //자신이 다른 숫자보다 작으면 숫자를 늘린다. (순위이므로)
			}
		}
		
		System.out.println("점수\t순위");
		System.out.println("=====================");
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]+"\t"+rank[i]);
		}
		
	}
}
