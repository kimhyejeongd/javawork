package polymorphism07;

public class CarTest {

	public static void main(String[] args) {
		Car car = null;
		FireCar fc = new FireCar("E9","black"); 
		FireCar fc2 = null;
		
		fc.getPower();
		fc.water();
		fc.speedUp();
		System.out.println(fc.infor());
		
		
		System.out.println(fc2.infor());
		// 다향성 : 호출은 같은 이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		// 자손타입 -> 부모타입으로 형변환
		System.out.println("--------------------------");
		
		
		car = fc;
		System.out.println(car.infor());
		car = fc2;
		System.out.println(car.infor());
        // 강제형변환: 부모타입 - > 자식타입으로 형변환
		FireCar fc3 = new FireCar();
		fc3 = (FireCar)car; //자식타입으로 객체생성 -> car타입을 형변환 - > 자식타입으로 형변환
		
		Car car2 = new Car();
		// fc2 = car2; 형변환 불가  Car 타입으로 생성(car객체), 자식객체로 변환 (자식객체, car객체)
	}

}
