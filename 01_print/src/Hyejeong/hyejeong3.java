package Hyejeong;

import java.util.Scanner;

public class hyejeong3 {

	public static void main(String[] args) {
		// 셋째날 문제풀이1. 실습문제
		/*1. 키보드로 부터 하나의 정수 입력받기
		그 정수가 음수이면 "음수"를 출력, 음수가 아니면 "음수가 아니다"를 출력하기*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		
		String a1 = num1 <= 0 ? "음수" : "음수가 아니다";	
		System.out.println(a1);
		
System.out.println("------------------------------------");

		/*2. 실습문제
		키보드로 부터 하나의 정수 입력받기
		그 정수가 음수이면 "음수"를 출력,
		음수가 아닌 경우 중 0이면 "0이다"를 출력, 0이 아니면 "양수"를 출력*/
		
		System.out.println("정수 입력 : ");
		int num2 = sc.nextInt();
		
		String a2 = num2 < 0 ? "음수" :
		            num2 == 0 ? "0이다" : "양수" ;
		System.out.println(a2);
		             
		System.out.println("------------------------------------");
		/*3. 실습문제
		키보드로 부터 하나의 정수 입력받기
		그 정수가 짝수이면 "짝수"를 출력,
		짝수가 아니면 "홀수"를 출력*/
		System.out.println("정수 입력 :");
		int num3 = sc.nextInt();
		String a3 = num3 / 2 == 0 ? "짝수" : "홀수";
		System.out.println(a3);
		
			
			
		System.out.println("------------------------------------");
		/*4. 실습문제
		모든 사람이 사탕을 골고루 나눠가지려고 한다
		인원 수와 사탕의 개수를 키보드로 입력 받고
		1인다 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하기

		ex.
		인원수 : 29
		사탕개수 : 100

		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13*/
		
	    System.out.println("인원 수 : ");
	    int peo1 = sc.nextInt();
	    
	    System.out.println("사탕의 개수 : ");
	    int can1 = sc.nextInt();
	    
	    int dd = can1 / peo1;
	    System.out.println("1인이 나눠가진 사탕 개수 :" + dd);
	    
	    int cc = can1 - dd * peo1;
	    System.out.println("남은 사탕의 개수 :" + cc);
	    
	    
		
		
		
		System.out.println("------------------------------------");
		
		
		
		/*5. 실습문제
		키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
		이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.

		ex.
		이름 : 이준기
		학년(숫자만) : 2
		반(숫자만) : 7
		번호(숫자만) : 3
		성별(M/F) : M
		성적(소수점 둘째 짜리까지) : 97.35

		2학년 7반 3번 이준기 남학생의 성적은 97.35이다.*/
		
		
		System.out.println("이름 : ");
		int nam = sc.nextInt();
		System.out.println("이름 : " + nam);
		
		System.out.println("학년 : ");
		int gra = sc.nextInt();
		System.out.println("학년 : " + gra);
		
		System.out.println("반 : ");
		int qks = sc.nextInt();
		System.out.println("반 : " + qks);
		
		System.out.println("번호 : ");
		int qjs = sc.nextInt();
		System.out.println("번호 : " + qjs);
		
		System.out.println("성별(M/F) : ");
	    char g = sc.next().charAt(0);
	    String dh = g == 'M' ? "남자" : "여자";
	    System.out.println(dh);
		
		System.out.println("성적(소수점 둘째자리까지) : ");
		int per = sc.nextInt();
		System.out.println("성적 : " + per);
		
		
		
		
		
		
		
		
		
		System.out.println("------------------------------------");
		/*6. 실습문제
		나이를 키보드로 입력 받아 13세 이하면 "어린이"를 출력
		13세초과 ~ 19세 이하이면 "청소년" 출력
		19세초과이면 "성인" 출력*/
		System.out.println("------------------------------------");
		/*7. 실습문제
		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.

		ex.
		국어 : 60
		영어 : 80
		수학 : 40

		합계 : 180
		평균 : 60.0
		합격*/
		
		//합격 점수 내는 것 - 입력받았다고 치고, int 국어 = 80; int end = 98;  int math = 24; 
		//String ak = kor > = 40 && eng >= 40 && mate >=40 && avg >=80 "합격" : "불합격";

		/*8. 실습문제
		주민번호를 입력받아 나자인지 여자인지 출력하기

		ex.
		주민번호를 입력하세요(- 포함) : 123456-3123456

		여자*/
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		/*String srt = sc.next();
		 * char gender = str.charAt(7);*/
		char gender = sc.next(). charAt(7); //1,2,3,4
		
		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		System.out.println(result);
		
		
		
		

	}

}
