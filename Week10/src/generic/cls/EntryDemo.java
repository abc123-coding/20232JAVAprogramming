package generic.cls;

public class EntryDemo {
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("김선달", 20);
		Entry<String, String> e2 = new Entry<>("기타", "이봉이");

		// Entry<int, String> e3 = new Entry<>(30, "아무개"); // 기초 타입 사용 불가

		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());
	}
}