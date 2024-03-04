package t2_arr;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = {'K','O','R','E','A'};
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println();
		
		System.out.println(strArray); //char타입의 배열은 문자열이 됨 => 그냥 됨 why? 문자의 배열(문자열)이기 때문에
	}}