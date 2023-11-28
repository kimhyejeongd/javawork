package cons01;
class A01 {
	/*
	 * 속성 (FILED) : 변수,상수
	 * 메소드 : 실행한 결과를 얻을 수 있다
	 * 생성자 : 객체가 생성될 때마다 1번 호출 (주로 속성에 초기화에 많이 사용)
	 */
	int num;
	String str;
	boolean bool;
	//반환형이 없고 클래스이름과 동일한 이름을 갖는다
	A01() {
		System.out.println("생성자가 호출 되었음");
		num = 10;
		str = "안녕";
		bool = true;
		
	}
	A01(int age, String name,boolean bool) {
		System.out.println("생성자가 호출 되었음");
		num = age;
		str = name;
		this.bool = bool;
	}
	//오버로딩 : 반환형은 상관없음, 메소드명은 같아야됨, 매개변수는 달라야됨(개수 or 자료형) 
	int plus() {
		return 0;
		
	}
	int plus(int num1) {
		return num1;
	}
	String plus(int num1,double num2) {
		double result = num1 + num2;
		
		return "합 = " + result;
	}
	int plus(int num1,int num2) {
		return num1+num2;
	}
	int plus(int num1,int num2,int num3) {
	return	num1+num2+num3;
	}
}

public class ConstMain {

	public static void main(String[] args) {
		A01 a01 = new A01();
		System.out.println(a01.str);

		A01 a02 = new A01(20,"홍길동",false);
		System.out.println(a02.str);
		
		int result=a01.plus(5);
		System.out.println(result);
		String str=a01.plus(5, 8.5);
		System.out.println(str);
	}

}
