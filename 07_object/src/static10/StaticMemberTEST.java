package static10;

import java.util.Scanner;

public class StaticMemberTEST {
	int a; //인스턴스 변수
	static int b; //정적변수
	

	public static void main(String[] args) {
		int c; //지역변수
		System.out.println(b);
		StaticMember.sMe3();
		
		for(int i=0; i<10; i++) { // i 지역변수
			
		}
		if(2<5 ) {
			int aaaa = 9;
		}
		StaticMember sm1 = new StaticMember();
		
		
		System.out.println("인스턴스 변수 : " + sm1.num);
		System.out.println("정적 변수 : " + StaticMember.sNum);
		
		sm1.Me1();
		StaticMember.sMe3();
		
		
		StaticMember sm2 = new StaticMember();
		sm2.sNum = 100;
		
		//클래스를 이용하는 모든 객체들의 공통으로 사용
		
		System.out.println(StaticMember.sNum);
		System.out.println(sm1.sNum);
		System.out.println(sm2.sNum);
	System.out.println("======================");
	System.out.println(StaticMemberTEST.Method1());
		
		StaticMemberTEST.Method1();
	//정적 main 메소드 끝
	}
		static int Method1() {
			return 10;
		}
	}


