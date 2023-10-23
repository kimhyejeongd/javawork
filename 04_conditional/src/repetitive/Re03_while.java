package repetitive;

import java.util.Scanner;

public class Re03_while {

	public static void main(String[] args) {
		//for문을 while으로
		int flag = 1; // 초기값
		while(flag <=5) { //틀리면 실행하지 않음,조건
			System.out.println("flage의 값은 " + flag);
		    flag++; // 증감식
		    	
		}
		System.out.println();
		
		int sum = 0;
		int i = 1;
		while(sum <= 100) {
			sum = sum + i++;
			//2 =  0  + 1
			//한 줄로 입력 sum += i;
			++i;
			
		}
		
		System.out.println("1~100까지의 합 :" + sum);
		
		//break : 반목문을 빠져나온다(for, while, do=while)
		int count = 0;
		while(true) {
			System.out.println(count++); 
			
			if(count == 3) 
				break;
		
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("멈추려면 'q' : ");
		char ch = scan.next().charAt(0);
		
		
		while(true) {
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램 종료");
		
		while(true) {
			System.out.println("연산할 숫자와 연산자 입력(끝내려면 @을 넣으세요) ex> * 4 9 : ");
			char op = scan.next().charAt(0);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
		
			
			if(op == '@')
				break;
			
			System.out.println(num1 + op + num2 + "=" + (num1*num2)); // +만 넣는다고 가정 
			
		}
		System.out.println("프로그램 종료");
			
			
			
			
			
			
			
			//1~ 하나씩 증가하면서 합계를 낸다
			//그합이 100이상이 되는 순간 while문을 빠져나온다
			//합과 어디까지 더했을 때 100이 되는지 그숫자를 출력
			//ex)1~34까지 더한 합 = 102  
		sum = 0;
		i = 0;
		while(sum <= 100) {
			sum += ++i;
			/* or
			i++;
			sum += i;
			 */
			
		}
		System.out.println("1~" + i + "까지의 합 =" + sum);
	}
}

	    
	    
		
	


