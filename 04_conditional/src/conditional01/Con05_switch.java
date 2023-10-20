package conditional01;

import java.util.Scanner;

public class Con05_switch {

	public static void main(String[] args) {
		int num1 = 1;
		
		switch(num1) { //스위치는 무조건 중괄호를 넣어준다
		case 1 : 
			System.out.println("1입니다");
			break; //break 를 만나면 switch문을 빠져나옴
		case 2 :
			System.out.println("2입니다");
			break;
		default :
				System.out.println("1과 2가 아닌 수");
			
			
			
		}
	   char ch = 'k'; //k, l, p
	   switch(ch) {
	   case 'k':
		   System.out.println("김씨입니다");
		   break;
	   case 'l' :
		   System.out.println("이씨입니다");
		   break;
	   case 'p':
		   System.out.println("박씨입니다");
		   break;
		   default:
			   System.out.println("성이 김,이,박이 아닙니다");
			   
	   }
	   System.out.println("----------------------");
	   
	 
	   switch(ch) {
	   case 'k':
		   System.out.println("김씨입니다");
	   case 'l' :
		   System.out.println("이씨입니다");
	   case 'p':
		   System.out.println("박씨입니다");
		   default:
			   System.out.println("성이 김,이,박이 아닙니다");
			   
	   }
      int month = 3;
      switch(month) {
      case 1 :
    	  System.out.println("겨울에 태어났군요");
    	  break;
    	  //12번 써야함 그렇기 때문에 아래 처럼 써줌
    	  
      }
      switch(month) {
      case 1: 
      case 2 :
      case 12 :
    	  System.out.println("겨울에 태어났군요");
    	  break;
      case 3 :
      case 4 :
      case 5 :
    	  System.out.println("봄에 태어났군요");
    	  break;
      case 6:
      case 7:
      case 8:
    	  System.out.println("여름에 태어났군요");
    	  break;
      case 9:
      case 10:
      case 11:
    	  System.out.println("가을에 태어났군요");
    	  
      }
      // 문1 사용자로 부터 연산자(+,-,*,/,%)의 숫자 2개를 입력받아 연산결과 출력
      Scanner sc = new Scanner(System.in);
      System.out.println("연산자 입력 :");
      char op = sc.next().charAt(0);
      System.out.println("연산할 첫번째 숫자 입력 : ");
      int num2 = sc.nextInt();
      System.out.println("연산할 두번째 숫자 입력 : ");
      int num3 = sc.nextInt();
      
      switch(op) {
      case '+' :
      System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
      break;
      case '-' :
      System.out.println(num1 + "-" + num2 + "-" + (num1-num2));
      case '*' :
          System.out.println(num1 + "*" + num2 + "*" + (num1*num2));
      
      case '/' :
          System.out.println(num1 + "/" + num2 + "/" + ((double)num1*num2));
          System.out.printf("%d//%d=%.2f",num1, num2, (double)num1/num2);
          break;
      case '%' :
          System.out.println(num1 + "%" + num2 + "%" + (num1%num2));
          break;
      default:
	

    			  
      }
    		  
    		  /*System.out.println("연산할 숫자와 연산자 입력(ex ] 3 + 5) : ");
    		  int num2 = sc.nextInt();
    		  char op = sc.next(),charAt(0);
    		  int num3 = sc.nextInt();*/
    		  
      

	}

}
