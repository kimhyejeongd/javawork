package repetitive;

import java.util.Scanner;

public class Re02_중첩for {

	public static void main(String[] args) {
		// 중첩 for문
		for(int i = 1; i<=3; i++) {
			for(int j=5 ;j<=10; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println();
		}
       // 구구단 2단 출력
		/*
		 2*1=2
		 2*2=4
		 2*3=6
		 ...
		 2+9=18
		 
		 3*1=3
		 3*2=6
		 */
		
		/*
		 * 구구단
		System.out.println(2 * 1 = 2);
		System.out.println(2 * 2 = 4);
		System.out.println(2 * 3 = 6);
		..
		System.out.println(2 * 4 = 8);
		for(i=1; i<=9; i++) {*/
		
		
		
		System.out.println(2 + "*"  );
		for(int dan=2; dan<=9; dan++) { //구구단 9단까지출력
			for(int i=1; i<=9; i++) {
				//System.out.println(dan + "*" + "=" + dan*1);
				System.out.printf("%d*%d=%2d\n",dan, i, dan*1);
			
			}
			
		
			

			
		}
		
			
		// 1. 키보드로 정수 두 개를 입력받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용 작은 값에서 큰 값까지 점수 합계를 구하기 
		Scanner scan = new Scanner(System.in);
				System.out.println("정수 입력 : ");
				int num1 = scan.nextInt();
				System.out.println("두번째 정수 입력 : ");
				int num2 = scan.nextInt();
				
			    
				
				
				
		
		
		
		
	}

}
