import java.util.*;
public class ArrayListTest1 {
	public static void main(String[] args) {
		String[] name = {"kim", "lee", "park", "jung", "oh"}; // 문자열 배열 생성
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name)); // 문자열 배열을 이용하여 리스트 객체(제네릭) 생성
																			// 정적 리스트를 동적으로 변경!
		System.out.println("초기 값: " + lname);
		lname.add("ha"); // 리스트 끝에 추가
		System.out.println("\"ha\" 추가 된 후의 값: " + lname);
		lname.set(0, "김"); // 바꿔치기
		lname.set(3, "곽"); // 추가
		System.out.println("\"김\"으로 변경되고 \"곽\"이 추가된 값: " + lname);
		Collections.shuffle(lname);
		System.out.println("shuffle() 메소드가 적용된 값: " + lname);
		System.out.println("5번쩨 요소의 값 : " + lname.get(4));

		Collections.sort(lname);
		System.out.println("sort() 메소드가 적용된 값: " + lname);
		System.out.println("5번쩨 요소의 값 : " + lname.get(4));

		Collections.reverse(lname);
		System.out.println("reverse() 메소드가 적용된 값: " + lname);
		System.out.println("5번쩨 요소의 값 : " + lname.get(4));
		
		Collections.fill(lname, "김");
		System.out.println("모든 요소를 \"김\"으로 설덩된 값: " + lname);

	}
}