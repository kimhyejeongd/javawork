package extend;
class Parant {
	int x=10;
	String str="부모";
	
	int method1() {
		return 20;
	}
}
class Child extends Parant {
	int pint=100;
	int childvar=100;
	String child="자식꺼";
	String str="내꺼";
	int x =100;
	void method2() {
String str="로컬변수";
System.out.println(this.str);
		System.out.println(str);
		System.out.println(super.str);
		
	}
 
	
}
public class 상속  {

	public static void main(String[] args) {
	Child ch1 = new Child();
	
	System.out.println(ch1.child);
	System.out.println(ch1.str);
	ch1.method2();

	}

}
