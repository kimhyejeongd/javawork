package print02;

public class Ch02_printf_digit {

	public static void main(String[] args) {
		/*  32000
		 * 123000
		 *   7800*/
		System.out.printf("%7d\n" + 32000); // 7자리 쟈리를 차지하라
		System.out.printf("%7d\n" + 132000);
		System.out.printf("%7d\n" + 7800);
		System.out.printf("%7d\n" + 2132000);
		
		System.out.printf("%07d\n " + 32000); // 7자리 쟈리를 차지하라
		System.out.printf("%07d\n " + 132000);
		System.out.printf("%07d\n " + 7800);
		System.out.printf("%07d\n " + 2132000);
		
		System.out.printf("----------------------");
		
		System.out.printf("[%10s]\n", "abcdefg"); // 오른쪽 맞춤
		System.out.printf("[%-10s]\n", "abcdefg"); // 왼쪽 정렬  열자리를 자리차지 하시오
		
		System.out.printf("----------------------");

		
		System.out.printf("%10.2f", 13.567); // 총 자릿수 10.2 자리로 출력, 11자리에서 반올림
		System.out.printf("%.3f\n", 12345.678978);
		
	}

}
