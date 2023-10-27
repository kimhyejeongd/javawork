package args13;

public class MultiAtgsTest {

	public static void main(String[] args) {
		String str = concatenate("a","b","c");
		System.out.println(str);
		String strArr[] = {"홍길동", "아무개", "이순신"};
		System.out.println(concatenate(strArr));
		System.out.println(con2("-","홍길동","아무개","이순신"));
		System.out.println(con2("/",new String[] {"1","2","3"}));
	    System.out.println(con2(" ",strArr));
	    
	}
  
    

    static String concatenate(String... a) {
    	String result = "";
    	for(String str :a) {
    		result += str + ", ";
    		
    	}
    	
    	return result;
    }
    static String con2(String delim, String...b) {
    	String result = "";
    	for(String str : b) {
    	
    	result += str + delim;
    	}
    	return result;
    }
    
    }


