package static_instence;
class stin { 
	//인스턴스 멤버 : 반드시 객체가 생성되야만 사용가능
	int inNum = 10;
	
	
	int plus(int x) {
		return inNum + x;
		
	}
	//정적 멤버
	static int sNum = 30;
	static int plus() {
		return sNum+10;
	}
}

public class Static_instenceTest {
	

	public static void main(String[] args) {
System.out.println(stin.sNum);
System.out.println(stin.plus());
	}

}
