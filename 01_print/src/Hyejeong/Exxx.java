package Hyejeong;

import java.util.Scanner;

public class Exxx {

	public static void main(String[] args) {
		int com =(int)(Math.random()) * 99 + 1 ;
        Scanner scan = new Scanner(System.in);
	    	    
        int user = 0;
		/*
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
		*/
		
		System.out.println("숫자 입력 : ");
		user = scan.nextInt();
		
		for (int i =user; i>=1; i--) {
			if(i == 1)
				System.out.print(i);
			else
				System.out.print(i + ",");
			
		}

	}

}
