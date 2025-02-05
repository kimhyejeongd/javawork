package scanner;

import java.util.Scanner;

public class Ch01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		// 문자열 단어로 입력받을 때 : next()
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("나이를 입력하세요 : ");
		// 정수로 입력받을 때 : nextInt()
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age);
		
		System.out.println("키를 소수점 2째자리까지 입력하세요 : ");
		double key = scan.nextDouble();
		System.out.println("당신의 키는 " + key);
		
		System.out.println("당신은 여자 입니까?(true of false) : ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 여자 입니까? " + gender);
		scan.nextLine();
		
		
		System.out.println("주소를 입력하세요 : ");
		String address = scan.nextLine();
		System.out.println("주소 : " + address);
		
		System.out.println("당신은 성별은 무엇입니까?(남, 여) : ");
		/*
		 *  String gender2 = scan.next();
		 *  char gender3 = gender2.charAt(0);
		 */
		
		char gender2 = scan.next().charAt(0); // 인덱스 번호 0-a, 1-b, 3-c, 4-d.../ 남(0), 남자(01)	
	    System.out.println("당신은 " + gender2 + "자 입니다.");
	    System.out.println("이름을 영문으로 쓰시오 : ");
	    char name2 = scan.next().charAt(3);
	    System.out.println("당신의 이름 중 4번째 글자는 " + name2 + "입니다");
	    
		
	}

}
