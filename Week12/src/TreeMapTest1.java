import java.util.*;

public class TreeMapTest1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(88, "국어");
		tm.put(100, "수학");
		tm.put(98, "영어");
		tm.put(80, "사회");
		tm.put(99, "과학");
		
		
		Map.Entry<Integer, String> me = tm.firstEntry();
		System.out.println("가장 낮은 성적은 " + me.getValue() + " 과목 " + me.getKey() + "점 입니다.");
		me = tm.lastEntry();
		System.out.println("가장 높은 성적은 " + me.getValue() + " 과목 " + me.getKey() + "점 입니다.");
		Map<Integer, String>cd = tm.headMap(80);
		System.out.println("CD 성적 과목 " + cd );
		Map<Integer, String>ab = tm.tailMap(80);
		System.out.println("AB 성적 과목 " + ab);
		System.out.println(tm);
		System.out.println(tm.descendingMap());

	}

}
