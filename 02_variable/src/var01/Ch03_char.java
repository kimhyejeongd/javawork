package var01;

public class Ch03_char {

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = '김';
		char ch3 = '&';
		// 따음표 두개는 두글자이상 하나는 한글자만
		System.out.println(ch1);
		System.err.println(ch2);
		System.out.println(ch3); // sysout치고 CTRL,SPACEBAR같이 후에 +ENTER
		
		char ch4 = 'A' + 1;
		System.out.println(ch4);
		//char re = ch5 + 1;  // 자동형변환 때문에 오류
		
		System.out.println("----------");
		char ch6 = 'A' + 'B'; // 유니코드 : 65(A)+49(1) = 114(r)
		System.out.println(ch6);
		

	}

}
