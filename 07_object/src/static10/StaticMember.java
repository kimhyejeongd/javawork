package static10;

public class StaticMember {
//인스턴스 필드
	int num = 1;
	String name = "이턴스";
	
	//정적 필드
	static int sNum = 2;
	static String sName = "김정적";
	
	//인스턴트 메소 - 인스턴스 메소드
	void Me1() {
		
		System.out.println("인스턴트 메소드 Me1()");
	}
	String Me2() {
		System.out.println("인스턴스 메소드 Me2()");
		return "Me2()";
		
	}
	//정적 메소드 = 정적 멤버만 호출가능 주의사항 : 정적멤버만 호출가능
	static void sMe3() { //객체를 상성하지 않고도 사용가능
		                 //객체 생성해도 사용가능
		//System.out.println(num); //인스턴트기 때문에 객체 생성해야만 가능
 		System.out.println(sNum);
		System.out.println("정적 메소드 sMe3()");
		sMe4();
		//Me2();  // \사용불가
	}
	static int sMe4() {
		System.out.println("정적 메소드 sMe4()");
		return 4;
	}
}
