import java.util.*;
public class TreeSetTest1 {
	public static void main(String[] args) {
		TreeSet<Integer> low = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		
		for(int i = 4; i >=0 ; i--) {
			low.add(i);
			even.add(i*2);
		}
		
		System.out.println("low집합: " + low+ " even집합: " + even);
		TreeSet<Integer> union = new TreeSet<Integer>(low);
		TreeSet<Integer> intersection = new TreeSet<Integer>(low);
		TreeSet<Integer> difference = new TreeSet<Integer>(low);
		
		union.addAll(even); // 합집합
		intersection.retainAll(even); // 교집합
		difference.removeAll(even); // 차집합
		
		System.out.println("low와 even의 합집합 " + union);
		System.out.println("low와 even의 교집합 " + intersection);
		System.out.println("low와 even의 차집합 " + difference);
	}
}
