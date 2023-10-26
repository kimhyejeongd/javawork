package objConstructorOverloding09;

public class Car {
	String company;
	String model;
	String color;
	int speed;
	
	
	Car() {
		this("삼성","sm5","흰색");
		System.out.println("매개변수 없는 생성자");
	}
	
	Car(String company) {
		this(company, null , null);
		System.out.println("매개변수 1개인 생성자");
		this.company = company;
	}
	Car(String company, String model) {
		this(company,model,"흰색");
		System.out.println("매개변수 2개인 생성자");
	}
		
	Car(String company, String model, String color) {
		System.out.println("매개변수 3개인 생성자");
		this.company = company;
		this.model = model;
		this.color = color;
		
	}
}
