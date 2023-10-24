package array01;

public class Array_Ex03 {

	public static void main(String[] args) {
		// 1. 총전, 평균 구하기  
        int score[] = {100, 97, 58 ,72, 97};
        //합계구하기
        
        int sum = 0;
        for(int i=0; i<score.length; i++) {
        	sum += score[i];
        	
        }
        //평균 구하기
        
        double abg = sum / (double)score.length;
        System.out.println("정수의 합계 :" + sum);
        System.out.printf("평균 : %.2f\n", abg); // 소수점 둘째 자리까지 평균 출력
        
        // 2. 최대값, 최소값 구하기
        int num[] = {65, 26, 56, 98, 54, 1, 89, 52, 87, 66};
        int max = num[0];
        int min = num[0];
        
        for(int i=1; i<num.length; i++) {
        	if(max < num[i]) {
        		max = num[i];
        	}
            if(min > num[i]) {
            	min = num[i];
            }
        }
System.out.println("최대값 : " + max);
System.out.println("최소값 : " + min);

int k = 1;
System.out.println(num[0+k]);
System.out.println(num[0+8]);

        }//이거 틀림
	
	}

	

