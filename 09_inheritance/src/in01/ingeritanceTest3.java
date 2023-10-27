package in01;
class D {
	int x;
	static int sx;
	
}
class E extends D {
	String x;
	static String sx;
}
public class ingeritanceTest3 {

	public static void main(String[] args) {
		
		E.sx = "마이비티스";
		D.sx = 123;
		//STATIC 은 사용가능
		
		E e = new E();
		e.x = "혼자 공부하는 자바";
		//e.x = 1234; //지역변수가 제일 우선순위 1순위 , 1.우선 객체가 생성된 필드부터 보고 있으면 그 필드사용
		//                                        2.만약 객체가 생성된 필드명이 없으면 상속받은 부모 필드를 살펴본다
		
		D d = new D();
		d.x = 9;
		System.out.println(d.x);
		

	}

}
