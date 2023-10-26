package exSnack12;

import java.util.Scanner;

public class SnackTest {

	public static void main(String[] args) {
		Snack s1 = new Snack();
		Snack s2 = new Snack("비스켓", "새우깡", "매운새우맛", 1, 2000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종류 입력 : ");
		s1.setKind(sc.next());
		System.out.println("이름 입력 : ");
		s1.setName(sc.next());
		System.out.println("맛 입력 : ");
		s1.setflavor(sc.next());
		System.out.println("갯수 입력 :");
		s1.setNumOf(sc.nextInt());
		System.out.println("가격 입력 : ");
		s1.setPrice(sc.nextInt());
		
		System.out.println("s1객체의 정보 : " + s1.information());
		System.out.println("s2객체의 정보 : " + s2.information());
		
		//s1객체의 수량을 3개로 변경
		//s1객체의 금액 변경
		//s1객체의 정보 출력
		
		//s2객체의 이름 변경
		//s2객체의 금액 변경
		//s2객체의 정보 출력
		
	}

}
