package 접근제한11;

import objCar05.Car;

public class 접근제한자Test {

	public static void main(String[] args) {
        접근제한 b1 = new 접근제한();
        
        b1.deposit(50000);
       System.out.println("현재 잔액 : " + b1.getBalance());
        b1.withdraw(30000);
        
        b1.deposit(30000);
        int balance = b1.getBalance();
        System.out.println("현재 잔액 : " + balance);
        
		/* Car car = new Car();
		car.getCompany();*/
        
        Car car = new car();
        
	}

}
