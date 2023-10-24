package array01;

public class Array_2차원Ex01 {

	public static void main(String[] args) {
        //2차원 배열에 각 학생(5명)별 점수 입력 각학생 행 점수는 열
		//국어, 영어, 수학
		int score[][] = {{95, 100, 78},
				         {64, 78, 56},
				         {52, 99, 75},
				         {92, 88, 36},
				         {81, 26, 98}};
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------");
		
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + "\t");
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			System.out.print(score[i][j] + "\t");
			}
			//System.out.print(sum + "\t");
			double avg = (double)sum / score[i].length;
			//System.out.printf("%.1f\n",avg );
			System.out.printf("d\t%.1f\n", sum, avg); // 한 두줄을 한줄로 쓴것
			
		}
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<score.length; j++) {
				sum += score[i][j];
				System.out.println(score[i][j] + "\t");
				
			}
			
		}
		
		
		
	

		
		
		}
		
	}


