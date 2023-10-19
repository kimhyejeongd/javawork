package op01;

public class Ch02_increase {

	public static void main(String[] args) {
		//++하나 증가
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		num1 = 10;
		num1--; //9
		num1--; //8
		num1++; //9
		System.out.println(num1);
		// 단항일 때는 연산자가 앞에 있으나 뒤에 있으나 결과는 똑같다
		++num1;
		--num1;
		
		//연산시 달라짐
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3; // 앞에 붙으면 무조건 나 먼저 증가시키고 계산함 1. num2증가 2. num3증가 뒤에 더하기 대입해주기 값은 22가 출력됨
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++; // 1. num2 증가 2. +10 = 21 3. 대입 - 원래 result 에는 22가 들어있었지만 대입하면 21로 바뀐다 4. num3 11로 변경
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = num2-- + ++num3; //10+11 21
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + --num3; //11+9=20
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = --num2 + num3--; // 9+10  19 
		System.out.println(result);
		

	}

}
