package casting03;

public class Ch03_castingOp {

	public static void main(String[] args) {
		// int형 보다 작은 자료형을 연산하면 int형으로 형변환됨
		byte b1 = 10;
		byte b2 = 20;
		// byte result = b1 + b2; 은 오류가 뜬다 int형으로 변환되기때문에 밑에 두 예시 중 하나로 변환해야한다
		byte result = (byte)(b1+b2);
		int resust2 = b1 + b2;
		
		char c1 = 'A';
		// char c2 = c1 + 1; 은 오류 
		char c2 = (char)(c1 + 1);
		int c3 = c1 + 1;
		System.out.println(c2);
		System.out.println(c3);

		int int1 = 100;
		int int2 = 3;
		int result3 = int1 / int2; // int/int는 int(소수점 이하 다 버리고 몫만 나오게됨)
		System.out.println(result3);
		
		int int3 = 100;
		double dou1 = 3;
		//int result4 = int3 / dou1; - 더블이 더 크기 때문에 자동 형변환이된다 
		int result5 = (int)(int3/dou1); //  소수점x할때
		
		
		int int4 = 100;
		int int5 = 3;
		double re = int4 / int5;
		System.out.println(re);
		// double re = (double)int4 / int5;  - 33.3333
		
		

		
		
		
	}

}
