package 김혜정;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 학생 정보 및 점수 입력");
		
		System.out.println("2. login(출력은 login이 되어야만 출력가능)");
        System.out.println("3. 학생 정보 출력");
        System.out.println("4. 합계와 평균 출력");
        System.out.println("5. logout");
        System.out.println("6. 프로그램 종료");
        
        System.out.println("------------------------------------");
        
        System.out.println("번호를 선택하세요 : ");
        scan.next();
        System.out.println("이름 입력 : ");
        scan.next();
        System.out.println("비밀번호 입력 : ");
        scan.next();
        System.out.println("나이 입력 : ");
        scan.next();
        System.out.println("국어점수 입력 : ");
        scan.next();
        System.out.println("영어 입력 : ");
        scan.next();
        System.out.println("컴퓨터 입력 : ");
        scan.next();
        System.out.println("수학 입력 : ");
        
	}
}
