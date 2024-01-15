// ArrayList 에 정수 을 추가한 후 가장 큰 값을 찾아 출력하는 프로그램을 작성하시오 
import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> lnum = new ArrayList(); // ArrayList 선언
		lnum.add(3); lnum.add(5); lnum.add(2); lnum.add(8); lnum.add(6); // 3,5,2,8,6 추가
		
		int max = lnum.get(0); // 최댓값을 저장할 변수 max
		for(int i : lnum) 
			if (max < i) max = i; // 모든 요소에 대해 최댓값 찾기 
		
		System.out.println("최대값 : " + max);
	}
}