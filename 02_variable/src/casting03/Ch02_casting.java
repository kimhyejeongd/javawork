package casting03;

public class Ch02_casting {

	public static void main(String[] args) {
		int num1 = 35848; // 원래 바이트에 35848이 못들어감
		byte b1 = (byte)num1; // 강제로 byte로 변환함
		System.out.println(b1);

		// double을 int로 바꿔라 (소수점을 없애고 정수로 바꿔라)
		double d1 = 26.9988;
		num1 = (int)d1;
		System.out.println(num1); 
		//string만 제외한 강제 변환 방법이다
		
		
		
	}

}
