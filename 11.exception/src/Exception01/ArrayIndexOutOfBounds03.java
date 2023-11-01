package Exception01;

import java.util.Arrays;

public class ArrayIndexOutOfBounds03 {

	public static void main(String[] args) {
		String str[] = {"a" , "b", "c"};
		try {
			str[4] = "d";
					
		}catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println("배열의 범위를 넘었습니다 index는"  +(str.length-1) +"까지만 사용가능");
			System.out.println(abe);
			
			
		}
		System.out.println(Arrays.toString(str));

	}

}
