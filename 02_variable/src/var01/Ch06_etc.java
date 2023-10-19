package var01;

public class Ch06_etc {

	public static void main(String[] args) {
		// 정수 long, 실수 float (int보다 큰 범위를 할 때 사용함)
		int num1 = 1111111111; // 이상하면 범위 오류가남 이럴 때 long
		long long1= 111111111111111L; // 인트로 자동으로 인식되기 때문에 LONG을 표현하려면 마지막에 반드시 L 넣기
		
		float float1 = 2.34534f; // 자체로는 double에 들어가지만 8바이트짜리를 4바이트에 넣으려고 하니까 오류가남 - 4바이트로 변환을 해서 넣으시오라는 뚯 (f(소문자, 대문자 상관 x)를 붙일것)
		
		// int안에 들어갈지 안들어갈지 모르는까 자료형의 범위를 미리만들어놓은 클래스를 사용한다
		System.out.println("byte크기 : " + Byte.MIN_VALUE +  " - " + Byte.MAX_VALUE);  // byte 크기
		System.out.println("short크기 : " + Short.MIN_VALUE + " - " + Short.MAX_VALUE); // short 크기 나머지도 동일하게 사용
		System.out.println("char크기 : " + Character.MIN_VALUE + " - " + Character.MAX_VALUE); // \\ 처음 글자만 대문자로 변경후 점찍기
		
		

	

	}

}
