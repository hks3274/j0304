package t2_arr;

public class Test16_Rank2 {
	public static void main(String[] args) {
		int[] su = {90,70,100,90,60};
		int[] rank = new int[su.length];
		
		//순위의 초기값 부여하기
		for (int i = 0; i < su.length; i++) {
			rank[i] = 1;
		}
		
		// 순위구하기
		for (int i = 0; i < su.length; i++) {
			for (int j = i+1; j < su.length; j++) {
				if(su[i] < su[j]) rank[i]++;
				else if (su[i] > su[j]) rank[j]++;
			}
		}
		
		System.out.println("점수\t순위");
		System.out.println("=====================");
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]+"\t"+rank[i]);
		}
		
	}
}
