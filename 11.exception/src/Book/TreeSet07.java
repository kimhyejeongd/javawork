package Book;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet07 {

	public static void main(String[] args) {
		int[] arrInt = {1,4,3,6,7,1,9,4,6,8}; //10개 중 중복 : 4개
		
	    TreeSet<Integer> ts = new TreeSet<>();
	    for(Object o : arrInt) {
	    	ts.add((Integer) o);
	    
		}
	    System.out.println(Arrays.toString(arrInt));
	    System.out.println(ts); // 오름차순 정렬로 출력
	    
	    //내림차순 정렬
	    NavigableSet<Integer> descend = ts.descendingSet();
	    System.out.println(descend);

	}

}
