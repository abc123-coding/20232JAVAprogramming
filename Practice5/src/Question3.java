// 주어진 정수 리스트를 queue를 이용하여 반전시키시오
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
		
		List<Integer> num =  new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));		
		Queue<Integer> q = new LinkedList<>();
		
		int size = num.size();
		
		for(int i = size - 1 ; i >= 0 ; i--) // 리스트에 역인덱스로 접근
			q.add(num.get(i));

		System.out.print("반전된 리스트 : " + q);

	}
}
