package inSuper04;
class Parent {
	int x = 10;
}
class Child extends Parent {
	int x = 20;
	
	void method() {
		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + super.x);
		System.out.println("super.x=" + super.x);
	}
}
public class SuperTest1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();

	}

}
