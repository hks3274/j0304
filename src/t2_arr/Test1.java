package t2_arr;

public class Test1 {
	public static void main(String[] args) {
		int atom = 0;
		
//		int mbc1 = 5;
//		int mbc2 = 5;
//		int mbc3 = 5;
//		int mbc4 = 5;
//		int mbc5 = 5;
		
		int kbc1 = 100;
		int kbc2 = 30;
		int kbc3 = 80;
		int kbc4 = 50;
		int kbc5 = 90;
		
		System.out.println("mbc1 = "+ kbc1);
		System.out.println("mbc2 = "+ kbc2);
		System.out.println("mbc3 = "+ kbc3);
		System.out.println("mbc4 = "+ kbc4);
		System.out.println("mbc5 = "+ kbc5);
		System.out.println();
		
//		int[] mbc;
//		mbc = new int[5];
		
		int[] mbc = new int[5]; //int 배열은 0을 초기값으로 줌
		
		
		for (int i = 0; i < mbc.length; i++) {
			System.out.println("mbc["+i+"] = "+mbc[i]);
		}
		System.out.println();
		
		for (int i = 0; i < mbc.length; i++) {
			mbc[i] = 5;
			System.out.println("mbc["+i+"] = "+mbc[i]);
		}
		System.out.println();
		
		
		
		for (int i = 0; i < mbc.length; i++) {
			mbc[i] = (i+1) * 10;
			System.out.println("mbc["+i+"] = "+mbc[i]);
		}
		System.out.println();
		
		
		int[] sbs = new int[5];
		sbs[0] = 100;
		sbs[1] = 30;
		sbs[2] = 80;
		sbs[3] = 50;
		sbs[4] = 90;
		
		for (int i = 0; i < sbs.length; i++) {
			System.out.println("sbs["+i+"] = "+sbs[i]);
		}
		System.out.println();
		
		
		
		
		int[] sbs2 = new int[] {100,30,80,50,90};
		
		for (int i = 0; i < sbs.length; i++) {
			System.out.println("sbs2["+i+"] = "+sbs2[i]);
		}
		System.out.println();
		
		
		
		int[] sbs3 = {100,30,80,50,90};
		
		for (int i = 0; i < sbs.length; i++) {
			System.out.println("sbs3["+i+"] = "+sbs3[i]);
		}
		System.out.println();	
		
	}
}
