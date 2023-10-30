package SingletonTest15;

//싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
class Singletion {
	//필드
	private static Singleton singleton = new Singleton();
	// new Singleton();
   
//정적필드
private static Singleton signleton2;

	//생성자에 private을 붙여 객체를 생성할 수 없게 만든다

	
		
		static Singleton getInstance() {
			return signleton;
		}
		
public class SingletonTest15 {
		
		public static void main(String[] args) {
			Singleton s1 = new Singleton(); //불가
			Singleton getInstance;
		}
	}

}
