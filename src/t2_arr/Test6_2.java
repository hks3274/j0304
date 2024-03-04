package t2_arr;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = {'K','O','R','E','A'};
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println();
		
		System.out.println(strArray); //char타입의 배열은 문자열이 됨 => 그냥 됨 why? 문자의 배열(문자열)이기 때문에
		System.out.println("===============================");
		
		System.out.println("strarr의 길이 : "+strArray.length);
		System.out.println();
		
		System.out.println("strArr을 문자로 변환:"+ Arrays.toString(strArray)); //배열을 문자열로 바꿈
		System.out.println();
		
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArrary["+i+"] = "+strArray[i]);		
		}
		
		System.out.println();
		
		String str = "korea";
		//현재 문자열 중에서 특정 인덱스에 위치한 문자를 반환? charAt() <- 메소드이다.
		
		for (int i = 0; i < str.length(); i++) { //.length() <- 메소드이다.
 			System.out.println("str("+i+") = "+str.charAt(i));
		}
	}
}
