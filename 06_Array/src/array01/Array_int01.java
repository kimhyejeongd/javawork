package array01;

public class Array_int01 {

	public static void main(String[] args) {

	    //배열 : 같은 자료형을 연속된 저장공간에 저장함
	    //      배열의 길이는 늘리거나 줄일 수 없다
	    //      int[] 변수명 = new int[갯수] ([]표시는 배열이라고 생각하면됨) or int 변수명[] = new int[갯수]

	        int arrayInt[] = new int[10];
	        int[] arrayIn2 = new int[5];
	        //배열을 만들면서 값을 바로 넣을 때
	        int arrayInt3[] = {1,2,3,4,5};
	         //      indaxx =  0,1,2,3,4   ex) 4를 출력하고 싶다 = 인덱스 번호 3번
	        
	        System.out.println(arrayInt3[0]);
	        System.out.println(arrayInt3[3]);
	        System.out.println("---------------------------------------------");
	        
	        
	        
	        arrayInt3[1] = 20;
	       
	        for(int i=0; i<=4; i++) {
	        	if(i==4)
	        		System.out.println(arrayInt3[i]);
	        	else
	        	System.out.print(arrayInt3[i]+ ", ");
	        	
	        	
	        }
	        /*arrayInt3[0] = 0 *2 = 0; 
	        arrayInt3[1] = 1 *2 = 2;
	        arrayInt3[2] = 4;
	        arrayInt3[3] = 6;
	        arrayInt3[4] = 8;*/
	        
	        
	        for(int i=0; i<=4; i++) {
	        	if(i==4)
	        	arrayInt3[i] = i*2;
	        	else
	        		System.out.println(arrayInt3[i] + ", ");
	        	
	        	
	        }
	        int int1[] = {3,4,5,6,7};
	        int int2[] = new int[10];
	        System.out.println("int1의 길이" + int1.length);
	        System.out.println("int2의 길이" + int2.length);
	        
	        for(int i = 0; i<int1.length; i++)
	        	System.out.println(int1[i]);
	        
	        //문제1. 길이가 5인 배열에 값을 for문으로 0,3,6,9,12를 넣고
	        //      합계를 구하여 출력하기
	        int int3[] = new int[5];
	        System.out.println("int3의 길이" + int3.length); //length는 =을 넣으면안됨
	        
	        for(int a = 0; a<int3.length; a+=3)
	        	System.out.println(int3[a]);//틀림
	        
	        
	        
	        
	}

}
