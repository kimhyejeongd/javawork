package staticObj;
class StaticAPI {
	int num =10; //인스턴스 변수
	static int snum = 40; // 클래스 변수
	
	void method() {
		System.out.println("인스턴스 메소드");
		
	}
	static void smethod() {
		System.out.println("클래스 메소드");
	}
}   


public class StaticMain {

	public static void main(String[] args) {
		StaticAPI sa = new StaticAPI();
		sa.num=20;
		
		
		System.out.println(sa.num);
		System.out.println(StaticAPI.snum);
		System.out.println(sa.snum);
		
		
		// 클래스 메소드
		StaticAPI.smethod();
 
		//인스턴스 메소드
		sa.method();
		

	}

}
