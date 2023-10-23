package repetitive;

import java.util.Scanner;

public class Re05_Math {

	public static void main(String[] args) {
		// Mate(수학에 관련된 클래스)
	    double rand1 = Math.random(); //실수형 : 0~0.9999999999
	    System.out.println(rand1);
	    System.out.println("---------------------------------------");
	    
	    double rand2 = Math.random() * 10; //0~ 9.9999999999
	    System.out.println(rand2);
	 
	    
	    int rerand2 = (int)rand2; // 0~9 사이의 숫자가 출력(소수점이하 버림)
	    System.out.println(rerand2);
	    
	    //1~10까지의 숫자를 얻고자 한다면
	    int re2Rand2 = (int)rand2 + 1 ;
	    System.out.println(re2Rand2);
	    System.out.println("========================================");
	    
	    //0~4
	    // 0.99999999 * 5
	    double rand3 =Math.random()*5;  // 0~4.999999999 // 0~4나오게 하려면 int reRand3 = (int)rand3;
	    System.out.println(rand3);
	    
	    
	    
	    System.out.println("---------------------------------------");
	    double rand4 = Math.random() * 100; //0~ 99.99999999
	    System.out.println(rand4);
	    
	    // 주사사위의 숫자 맞추기 게임
	    // 랜덤으로 주사위숫자 만들기
	    // 사용자로부터 숫자 입력받아서
	    // 숫자를 맞추면 축하합니다. 맞췄습니다 하고 끝내기
	    // 못맞췄으면 계속하기
	    
	    // 랜덤으로 1~6까지의 숫자 추출하기
	    int com =(int)(Math.random()) * 6 + 1 ;
	    int user = 0;
	    do {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("주사위의 숫자를 맞춰보세요 : ");
	    user = scan.nextInt();
	    if(com == user)
	    	System.out.println("축하합니다. 맞췄습니다");
	    else
	    	System.out.println("틀렸습니다. 다시 넣으세요");
	    } while(com != user);
	    
	    

	}

}
