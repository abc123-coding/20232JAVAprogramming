import java.util.*;

public class HashMapTest2 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("가위, 바위, 보! (각 1,2,3): ");
		int user = p.nextInt()-1;
		Random random = new Random();
		int com = random.nextInt(3);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "가위");
		hm.put(1, "바위");
		hm.put(2, "보");
		
		Object value1 = hm.get(user);
		System.out.println("사용자 - " + value1);
		
		Object value2 = hm.get(com);
		System.out.println("com - " + value2);
		
		if(user == com)
			System.out.println("비겼습니다");
		else if(user == (com + 1) %3)
			System.out.println("이겼습니다");
		else
			System.out.println("졌습니다");
	}

}
