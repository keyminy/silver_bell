package ch08.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// s1 - s2 > 0 이면 => 오름차순
		// s1 - s2 < 0 이면 => 내림차순
		return s1.compareTo(s2) * -1; //내림차순임
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		/*생성자에 Comparator를 구현한 객체를 넣습니다
		 * public TreeSet(Comparator<? super E> comparator)*/
		//즉 이 예제는, MyCompare객체 기준으로 정렬을 하게 해줍니다(내림차순)
		Set<String> set = new TreeSet<>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
		
	}

}
