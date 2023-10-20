package repetitive;

public class Re01_for {

	public static void main(String[] args) {
		// 반복문 : 원하는 갯수만큼 반복하여 실행하고자 할 때
		/* 
		 for(초기시; 조건식; 증감식) {
		 실행문
		 }
		 */
       for(int i=1; i<=10; i++) { // i를 10번 반복해서 출력
    	   System.out.println("안녕하세요");
    	   System.out.println("\t 반갑습니다");
           /*for(int i=1; i<=10; i++) { // 1 안녕하세요 2안녕하세요 ---이렇게 하고싶을때는 아래처럼
        	   System.out.println(i + "안녕하세요");*/
    	   
       }//여기부터 i 변수가 사라짐
       
       System.out.println("-------------------------");
        
       for(int i=1; i<10; i+=2) {
    	   System.out.println(i + ".번 출력");
    	   
       }
       System.out.println("-------------------------");
       for(int i=10; i>=1; i--) {
    	   System.out.println(i + ". 1씩감소");
       }
       System.out.println("-------------------------");
       //1 ~ 10까지의 합 구하기
       int sum = 0;
       for(int i = 1; i<=10; i++) {
    	   sum = sum + i;
    	   System.out.println("합계 = " + sum);
    	   
       }
	System.out.println("1~10까지의 합계 = " + sum);
	}

}
