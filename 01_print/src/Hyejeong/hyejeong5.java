package Hyejeong;

import java.util.Arrays;
import java.util.Scanner;

public class hyejeong5 {

	public static void main(String[] args) {
 /*1.
사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

ex.\

정수 : 5
배열 0번째 인덱스에 넣을 값 : 4
배열 1번째 인덱스에 넣을 값 : -4
배열 2번째 인덱스에 넣을 값 : 3
배열 3번째 인덱스에 넣을 값 : -3
배열 4번째 인덱스에 넣을 값 : 2
4 -4 3 -3 2 
총 합 : 2*/
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("배열의 길이 입력: ");
		int num =  sc.nextInt();
		
		int iArr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			System.out.println("배열[" + i + "] index에 넣을 값 입력 :");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
			
		}
			System.out.println(Arrays.toString(iArr));
			System.out.println("총합 = " + sum);*/
			
			/*2. 
            3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
            중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
            단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
            다시 정수를 받도록 하세요. 

            ex.
            정수 : 4
            다시 입력하세요.
            정수 : -6
            다시 입력하세요.
            정수 : 5
            1, 2, 3, 2, 1*/
		
		
			/*while(true) {
				System.out.print("정수 입력 :");
				int num2 = sc.nextInt();
				
				if(num2 %2 ==0 || num2 <3) {
					System.out.println("다시 입력하세요");
				
					continue;
				}
			int iArr2[] = new int[num2];
			int count = 1;
			for(int i=0; i<num2; i++) {
				if(i < num2/2) //5/2= [0][1] [2] [3][4]
					           //      1  2   3   2
					iArr2[i] = count++;
				else
					iArr2[i] = count--;
				
			}
			System.out.println(Arrays.toString(iArr2));
			break;*/
		
			/*풀이 2	
			 System.out.print("정수 입력:");
			 int num2 = sc.nextInt();
			 
			 if(num2 %2 ==1 || num2 > 3) {
			 
			 } else {
			 system.out.println("다시 입력하세요");
			 system.out.print(정수 입력 : ");
			 num2 = sc.nextInt();
			 
			 
			 
			 */
			
			
			
			
			
			
			
			/*3.
			사용자가 입력한 값이 배열에 있는지 검색하여
			있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
			단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

			ex.
			치킨 이름을 입력하세요 : 양념			
			양념치킨 배달 가능

			치킨 이름을 입력하세요 : 불닭
			불닭치킨은 없는 메뉴입니다.*/
			/*String chickens[] = {"후라이드","양념","파닭","간장"};
			System.out.print("치킨 이름을 입력하세요 : ");
			String menu = sc.next();
			
			boolean flag = false;
			for(int i=0; i<chickens.length; i++) {
				if(menu.equals(chickens[i])) {
					flag = true;
					break;
					
				}
			}
			if(flag)
				System.out.println(menu + "치킨 배달 가능");
			else
				System.out.println(menu + "은 없는 메뉴입니다");*/
			
			/*4.
주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

ex.
주민등록번호(-포함) : 123456-1234567
123456-1*******/
		System.out.print("주민번호 입력(-포함) :");
		String jumin = sc.next();
		
		char[] origin = new char[jumin.length()];  //length에 괄호가 붙은것은 메소드로 쓰인다
		for(int i=0; i<origin.length; i++); {
		    origin[i] = jumin.charAt(i);
			
	char[] copy = new char[origin.length];
	for(int i=0; i<copy.length; i++) {
		if(i<8)
			copy[i] = origin[i];
		else
			copy[i] = '*';
	}
		System.out.println(copy);
	}

}
			
		}


		
		
		
	
	 
	


