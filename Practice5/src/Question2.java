// 문자열 배열을 LinkedList 로 저장한 다음 프로그램 실행 시 받은 요소를 지정된 위치에 추가하여 결과를 출력하는 프로그램을 작성하시오.
import java.util.*;

public class Question2 {
	public static void main(String[] args) {

		String[] s = {"사과","오렌지","귤","배","포도","감"}; 
		LinkedList<String> llfruits  = new LinkedList<String>(Arrays.asList(s));
		
		int number = -1;
		String fruit = "";
		
		System.out.print("추가를 원하는 위치와 이름 입력(위치 이름) : ");
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			number = sc.nextInt();
			if(sc.hasNext()) {
				fruit = sc.next();
			}
		}
		
		System.out.println("초기의 리스트 : " + llfruits);
		llfruits.add(number-1, fruit);
		System.out.println("추가된 이후의 리스트 : " + llfruits);		
	}
}
