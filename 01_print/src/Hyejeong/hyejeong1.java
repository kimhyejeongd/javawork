package Hyejeong;

import java.util.Scanner;

public class hyejeong1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("당신은 여자 입니까?(true of false) : ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 여자 입니까? : " + gender);
		scan.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는" + age);
		
		System.out.println("키를 소수점 2째자리까지 입력하세요 : ");
		double key = scan.nextDouble();
		System.out.println("당신의 키는 " + key);
	
		
		
		
		
		
		

	}

}
