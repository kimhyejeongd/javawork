package array01;

public class Array_2차원05 {

	public static void main(String[] args) {
		//int iArr[][] = new int[4][3]; //3행5열
		int[][] score = {{1,2,3,4,5},  //인덱스번호[0]
				         {4,5,6,7,8},  //인덱스번호[1]
				         {9,10,11,12,13}};  //인덱스번호[2]
		                // 0, 1, 2, 3, 4
		System.out.println(score[1][2]);  //6
		System.out.println(score[2][3]);  //12
		
		System.out.println("score의 길이(행길이) : " + score.length); //score의 길이는 행의길이이다
		System.out.println("score의[0]의 길이(열길이) :" + score[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				
			}
			System.out.println();
		}
		//score[0][2] = 67; // 3대신 67을 넣으시오
		System.out.println("----------------------------------");
		
		int iArr[][] = new int[4][3];
		int count = 1;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j] = count++;
				System.out.print(iArr[i][j] + " ");
				
				
			}
			System.out.println();
		}
		int iArr2[][] = {{1,2,3},
				         {4,5},
		                 {6,7,8,9}}; 
		
		for(int i=0; i<iArr2.length; i++) {
			for(int j=0; j<iArr2[i].length; j++) {
				System.out.println(iArr2[i][j] + " ");
				
			}
			System.out.println();
		}
		

	}

}
