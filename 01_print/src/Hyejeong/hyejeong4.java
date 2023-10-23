package Hyejeong;

import java.util.Scanner;

public class hyejeong4 {

	public static void main(String[] args) {
/*1. 1~100까지 3의 배수의 합 구하기*/
		 
/*2. 사용자로부터 숫자를 양수를 입력받아 1~입력받은 숫자까지 합계 구하기
    ex)
    숫자를 입력하세요 : -2
    양수를 입력하세요
    숫자를 입력하세요 : 10
    1~10까지의 합 = 55*/
    
/*3. 1~100까지 숫자를 맞추기 게임
     랜덤으로 1~100까지의 숫자를 추출하고
     scan으로 사용자로 부터 숫자를 입력받아 숫자 맞추기
    ex)
    랜덤 추출한 숫자 : 5
    숫자를 입력하세요 : 10
    더 작은 숫자를 입력해보세요
    숫자를 입력하세요 : 2
    더 큰숫자를 입력해보세요
    숫자를 입력하세요 : 5
    축하합니다 맞췄습니다 종료*/
    
        int com =(int)(Math.random()) * 99 + 1 ;
        Scanner scan = new Scanner(System.in);
	    
	    
        int user = 0;
	    
	    do {
	    System.out.println("1~100 사이의 숫자를 입력하세요 : ");
	    user = scan.nextInt();
	    
		    if(user > com) {
		    	System.out.println("더 작은 숫자를 입력해보세요");
		    } else if(user < com) {
		    	System.out.println("더 큰 숫자를 입력해보세요");
		    }
	    
	    
		} while(user != com);
		System.out.println("축하합니다, 맞췄습니다.");
	    
	    
	

	    
	    
	    
    

/*4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다. 
ex.
1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.

1이상의 숫자를 입력하세요 : 4			
4 3 2 1*/
while(true) {
	System.out.println("숫자 입력 : ");
user = scan.nextInt();

if(user == 0) {
	System.out.println("1이상의 숫자를 다시 입력하세요");
continue;
}
	

for (int i =user; i>=1; i--) {
	if(i == 1)
		System.out.println(i + "\n");
	else
		System.out.println(i + ",");
	
}
break;
}



	

/*5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
ex
첫 번째 숫자 : 9
두 번째 숫자 : 0
1 이상의 숫자를 입력해주세요.

첫 번째 숫자 : 8
두 번째 숫자 : 4 
4, 5, 6, 7, 8,*/
  /* 1번째 답
   *    boolean change = true;
      while(change) {
    	  System.out.println("두 수를 입력하세요 ex> 56 8 :");
    	  int num1 = scan.nextInt();
    	  int num2 = scan.nextInt();
    	 
    	  if(num1 == 0 || num2 == 0 ) {
    		  System.out.println("0보다 큰 숫자 입력");
    		  continue;
 
    	  }
    	  
    	  if(num1 > num2) {
    		  for(int i = num2; i < num1; i++)
    			  System.out.println(i + ", ");
    	  } else  {
    		  for(int i = num1; i<= num2; i++)
    			  System.out.println(i + ", ");
    	  }
    	  
    	  
    	  change = false;*/
      boolean change = true;
      while(change) {
	  System.out.println("두 수를 입력하세요 ex> 56 8 :");
	  int num1 = scan.nextInt();
	  int num2 = scan.nextInt();
	 
	  if(num1 == 0 || num2 == 0 ) {
		  System.out.println("0보다 큰 숫자 입력");
		  continue;

	  }
	  // 두번째 방법
	  if(num1 > num2) {//num1은 작은수 num2 큰 수 넣고 싶은데 바뀌었을때 다시 바꾸는 방법
		  int tmp = num1;
		  num1 = num2;
		  num2 = tmp; 
	  } else  {
		  for(int i = num1; i<= num2; i++)
			  System.out.println(i + ", ");
	  }
	  
	  for(int i = num2; i<=num2; i++)
		  System.out.print(i + ", ");
	  change = false;
      }
	}
}
       
	


