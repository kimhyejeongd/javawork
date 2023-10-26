package objConstructorOverloding09;

public class CarTest {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// this() - > 다른 생성자 호출(매개변수의 개수와 자료형이 같은 생성자를찾아감)
		Car car1 = new Car("기아","k7","빨강");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println();
		
		Car car2 = new Car("현대","h8","노랑");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println("--------------------");
		Car car3 = new Car();
		System.out.println("--------------------");
		Car car4 = new Car("삼성","sm7","흰색");
		Car car5 = new Car("대우");
		Car car6 = new Car("벤츠","b7");
       
		
	}

}
