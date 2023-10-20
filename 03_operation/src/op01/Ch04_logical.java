package op01;

public class Ch04_logical {

	public static void main(String[] args) {
		// 논리합과 논리곱
		/* 
		 * x  y  논리합(&&)-그리고, 두개가 참일 때만 참이다/  논리곱(||)-또는, 둘중에 하나만 참이여도 참이다
		 * 0  0      0                                   0
		 * 0  1      0                                   1
		 * 1  0      0                                   1
		 * 1  1      1                                   1
		 */

		int num1 = 10;
		int num2 = 20;
		
		boolean re1 = num1 > num2 && num1 < num2;
		System.out.println(re1);
		
		re1 = num1 > num2 || num1 < num2;
		System.out.println(re1);
		
		// ! : not
		boolean b1 = num1 >= num2;
		boolean re2=  !b1;
		System.out.println(re2); //ture
		System.out.println(!re2); //false 
		System.out.println("-------------------");
		
		// A : 65, a : 97
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		System.out.println("소문자 인가?" + (ch1 >= 'a' && ch1 <= 'z')); 
		System.out.println("대문자 인가?" + (ch1 >= 'A' && ch1 <= 'z')); 


		
		
		
	}

}
