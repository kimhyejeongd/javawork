package print02;

public class Ch01_printf {

	public static void main(String[] args) {
		
		// "%d - 십진수를 출력    %d %d 십진수 두개를 출력
		System.out.printf("%d\n", 3); // 십진수 3을 출력
		System.out.printf("%d, %d\n", 5, 8);
		
		System.out.printf("%d, %d\n" , 123456, 8923456); 
		// = 주민등록번호를 십진수로 출력
	
        System.out.printf("%o\n", 9); // 9를 8진수로 출력
        
        System.err.printf("%X\n", 13); // 13을 16진수로 출력
        
        System.out.printf("%f\n", 3.12345678945655); // 실수형 출력(소수점은 6자리까지 출력)
        
        System.out.printf("%c\n", 'n'); //문자 한개 출력  n을 출력
        
        System.out.printf("%s\n", "abcdef"); // 문자열 출력 abcdef 출력
        
        System.out.printf("%b\n", true); // boolunce 출력
        System.out.printf("%b\n", 6 >= 3);
        
        // 올해는 2023년 10월 이고, 우리나라의 평균키는 164.8 입니다 출력
        System.out.printf("올해는 %d년 %d일 이고, 우리나라의 평균키는 %f 입니다", 2023, 10, 164.8);
        
        // 이 과정의 정원은 20명이고, 현재는 9명 수강중 입니다. 평균 23.5% 달성했습니다
        System.out.printf("이 과정의 정원은 %d명이고, 현재는 %d명 수강중 입니다. 평균 %f%% 달성했습니다", 20, 9, 23.5);

	}

}
