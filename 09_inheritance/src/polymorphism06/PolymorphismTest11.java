package polymorphism06; //다형성
class A {
	
	int aa = 10;
	
}
class B extends A {
	int bb = 20;
	
}
class C extends A {
	int cc  = 30;
	
}
class D extends C {
	int dd = 40;
}
class R extends B {
	int ee = 50;
}
public class PolymorphismTest11 {

	public static void main(String[] args) {
		B b1 = new B();
		A a1 = b1; //a클래스로 형변환 : A클래스와 인스턴스 멤버만 사용가능
		
		a1.aa = 100;
		
		System.out.println(a1.aa);
		
		C c1 = new C();
        a1 = c1;
        System.out.println(a1.aa);
        
        D d1 = new D();
        C c2 = d1;
        
        c2.cc = 300;
        c2.aa = 1000;
        
        A a2 = d1;
        a2.aa = 10000;
        //a2.cc = 34; c클래스 사용 불가
        E e1 = new E();
        
	}

}
