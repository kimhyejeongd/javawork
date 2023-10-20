package conditional01;

public class Con01_if {

	public static void main(String[] args) {
		//if(조건식)
		//     조건식이 참일 때 실행  
		
		int num1 = 100;
		if(num1 == 100) { //실행문이 하나일 때 총괄호 생략 가능
			System.out.println("100입니다");
		}

		if(num1 < 50) { // 실행문이 하나 이상일 때에는 반드시 중괄호를 넣는다
			System.out.println("합격입니다"); //참이 아니면 출력이 안된다x
	        // 중괄호가 없을 때에는 if문과 상관이없음
	     	System.out.println("축하합니다"); // 위에랑 상관없기 때문에 무조건 출력됨
	     	
		}
		System.out.println("if문과 상관없이 실행됨");
		
	
	   }

      }
