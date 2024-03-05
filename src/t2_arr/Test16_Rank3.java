package t2_arr;

//순위를 구한 후 오름차순 출력
public class Test16_Rank3 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 5, 7, 9 };
		int[] su = { 90, 70, 100, 90, 60 };
		int[] rank = new int[su.length];
		int temp = 0;
		
		// 순위구하기
		for (int i = 0; i < su.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < su.length; j++) {
				if (su[i] < su[j])
					rank[i]++; // 자신이 다른 숫자보다 작으면 숫자를 늘린다. (순위이므로)
			}
		}

		// 출력1
		System.out.println("==>> 원본자료 출력");
		System.out.println("번호\t점수\t순위");
		System.out.println("=====================");
		for (int i = 0; i < su.length; i++) {
			System.out.println(num[i] + "\t" + su[i] + "\t" + rank[i]);
		}

		// 순위 오름차순(혹은 점수 내림차순) => 선택정렬
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(rank[i] > rank[j]) {
					temp = rank[i]; rank[i] = rank[j]; rank[j] = temp;
					temp = num[i]; num[i] = num[j]; num[j]= temp; 
					temp = su[i]; su[i] = su[j]; su[j]= temp;
				}
			}
		}

		// 출력2
		System.out.println("==>> 순위순 정렬자료 출력");
		System.out.println("번호\t점수\t순위");
		System.out.println("=====================");
		for (int i = 0; i < su.length; i++) {
			System.out.println(num[i] + "\t" + su[i] + "\t" + rank[i]);
		}

	}
}
