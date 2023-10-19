package casting03;

public class Ch01_promotion {

	public static void main(String[] args) {
		byte b1 = 20; // 작은것을 큰것에 넣는것은 오류가 안남
		short s1 = b1;
		
		int int1 = b1;
		int1 = s1;
		System.out.println(int1);
		
		double d1 = int1;
		System.out.println(d1);
		
		char ch1 ='A';
		int intch = ch1;
		System.out.println("영문자 A의 유니코드 : " + intch);

		char ch2 = '검';
		int intCh2 = ch2;
		System.out.println("한글 '김'의 유니코드 : " + intCh2);
		System.out.println("한글 \"김\"의 유니코드 : " + intCh2);
		
		

	}

}
