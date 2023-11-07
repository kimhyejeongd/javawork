package Book;

import java.util.TreeSet;

public class TreeSet06 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(100);
		scores.add(93);
		scores.add(74);
		scores.add(58);
		
		int score = scores.first();
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());

		System.out.println("100점 아래 점수  : " + scores.lower(100));
		System.out.println("87점 위 점수  : " + scores.higher(87));
		System.out.println("74점과 동일하거나 아니면 바로 아래 점수 : " + scores.floor(74));
		System.out.println("90점과 동일하거나 아니면 바로 위 점수 : " + scores.ceiling(90));
		
		System.out.println("가장 낮은 점수 삭제 : " + scores.pollFirst()); // 58을 꺼내오고 삭제
		System.out.println("가장 높은 점수 삭제 : " + scores.pollLast()); //100을 꺼내오고 삭제
		
		System.out.println("74~100점 사이의 정수들 : " + scores.subSet(74, 100));
		//headSet(정수, 본인포함여부(기본값 false))
		System.out.println("87점보다 낮은 점수들 : " + scores.headSet(87, true));
		
		//tailSet(정수, 본인포함여부(기본값 true))
        System.out.println("87점보다 높은 점수들 : " + scores.tailSet(87));


		

	}

}
