package in01;

class A {
	int aa = 1;
}
// 상속은 1개만 가능
class B extends A {
	int bb = 2;
}
class C extends B {
	int cc = 3;
}
public class ingeritanceTest1 {

	public static void main(String[] args) {
		C objC = new C();
		System.out.println("C클래스 객체에서 aa속성 값 : " + objC.aa);
		System.out.println("C클래스 객체bb속성 값 : " + objC.bb);
		System.out.println("C클래스 객체cc속서 값 : " + objC.cc);
		
		B objB = new B();
		System.out.println("B클래스 객체에서 aa속성 값 : " + objB.aa);
		System.out.println("B클래스 객체bb속성 값 : " + objB.bb);
		//System.out.println("C클래스 객체cc속서 값 : " + objB.cc); // C는 사용 못함		
		
		A objA = new A();
		System.out.println("A클래스 객체에서 aa속성 값 : " + objA.aa); //B,C 사용불가

	}

}
