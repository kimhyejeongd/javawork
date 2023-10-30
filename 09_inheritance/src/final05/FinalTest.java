package final05;
final class Final101 {
	
class Final02 {
	int num = 10;
	//변수 앞에 FINAL을 붙이면 상수가 됨 : 값이 한번 저장되면 변경불가
	
	final int NUM2 = 34;
	// 메소드앞에 FINAL을 붙이면 오버라이딩 불가
	final int play() {
		
		return num;
	}
	int show() {
		return num;
	}
}
class Final02Infer extends Final02 {
	/* 메소드 재정의 불가
	 * int play() {
		return 3;*/
	@Override
	int show() {
		return 5;
	}
	}
}


public class FinalTest {

	public static void main(String[] args) {

	}

}
