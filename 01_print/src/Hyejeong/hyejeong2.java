package Hyejeong;

import java.util.Scanner;

public class hyejeong2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요 ex. 문자열을 입력하세요 : apple 첫번째 문자 a 두번재 문자 p 세번째 문자 p
		System.out.println("문자열을 입력하세요 : ");
	    String rla = sc.next();
	    char c1 = rla.charAt(0);
	    char c2 = rla.charAt(1);
	    char c3 = rla.charAt(2);
        System.out.println(c1 +","+ c2 +","+ c3);
        
        //2. 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요. ex. 문자 A unicode :65

		
		
		System.out.println("문자 하나를 입력하세요 : ");
		char ch1 = sc.next().charAt(0);
		int reCh1 = ch1;
		System.out.println(ch1 + "의 unicode : " + reCh1);
		
		//3.정수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요. 이 때 총점은 정수형 평균은 실수형으로 소수점 3째 자리에서 반올림하여 2째 자리까지 나오도록 하세요.
		//ex. 국어 : 90 영어 : 90 수학 : 95 총점 : 270 평균 : 91.67
		
	    /*System.out.println("국어점수 입력");
	    int kor = sc.nextInt();
	    System.out.println("영어점수 입력");
	    int eng = sc.nextInt();System.out.println("수학점수 입력");
	    int math = sc.nextInt();*/
		//아니면
	    System.out.println("국어, 영어, 수학 점수 입력 : ");
	    int kor = sc.nextInt();
	    int eng = sc.nextInt();
	    int math = sc.nextInt();
	    System.out.println(kor);
	    System.out.println(eng);
	    System.out.println(math);
	    
	    //총점
	    int sum = kor + eng + math;
	    
	    //평균
	    //double avg = (double)sum / 3;아니면
	    //double avh = sum / (double)3;아니면
	    double avg = sum / 3.0;
	    
	    //출력
	    System.out.println("총점 : " + sum);
	    System.out.println("평균 : " + avg); //여기서 소수점 조절하고싶다면 System.out.printf("평균 : %.2f, avg);
	    
	    

		
		// 4. 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
//주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.

        int iNum1 = 10;
        int iNum2 = 4;
        
        float fNum = 3.0f;
        
        double dNum = 2.5;
        
        char ch = 'A';
        
        System.out.println( iNum1 / iNum2 ); // 2
        System.out.println((int)dNum  ); // 2
        
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println((double) iNum1 ); // 10.0
        
        System.out.println( (double)iNum1 / iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        
        System.out.println( (int)fNum ); // 3
        System.out.println( iNum1 /(int) fNum ); // 3

        System.out.println( iNum1 / fNum );// 3.3333333
        System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
        
        System.out.println( ch ); // 'A'
        System.out.println( (int)ch ); // 65
        System.out.println((int) ch +  iNum1 ); // 75  연산 때문에 자동형 변환됨
        System.out.println((char)(ch + iNum1) ); // 'K' char형을 int형으로 강제형변환 + int형
       // char + int = int(자동형변환 - 유니코드)
        //복습해라...
		

	}

}
