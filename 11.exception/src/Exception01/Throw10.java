package Exception01;

public class Throw10 {

	public static void main(String[] args)   {
		//throw는 강제로 예외 발새애을 시킬 때 상용
		
		try {
			/*Exception e = new Exception("고의로 발생시킴");
			throw e;*/
		int num = 3/0;
		}catch(Exception e) {
			//e.printStackTrace();
			e.getMessage();
			
			System.out.println("예외 발생");
		}
		
	}

}
