package Exception01;
//Dog 클래스만 사용

public class ClassCast6 {
	public static void main(String[] args) {
     ClassCast6.changeif(new Animal());
     ClassCast6.changeif(new Dog());
     System.out.println("-------------------------------------------------");
     
     
     

    ClassCast6.changTry(new Animal());
    ClassCast6.changTry(new Dog());
	}

public static void changTry(Animal ani) {
	try {
		if(ani instanceof Dog) {
			
		}
		Dog dog = (Dog)ani;
		Cat cat = (Cat)ani;
	}catch(ClassCastException e) {
		System.out.println("형변환 불가");
	}
}
public static void changeif(Animal ani) {
	if(ani instanceof Dog) {
		Dog dog = (Dog)ani;
		System.out.println("Dog클래스로 형변환");
		
	}else if(ani instanceof Cat) {
		Cat cat = (Cat)ani;
		System.out.println("Cat클래스로 형변환");
		
	}else {
		System.out.println("클래스 형변환 불가");
	}
		
}
}