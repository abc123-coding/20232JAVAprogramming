//메소드에도 generic type이 있다!
package generic.cls;

public class GenMethod1Demo {
	static class Utils {
		public static <T> void showArray(T[] a) {  // <T> 는 타입 매개 변수로, 반환 타입(void) 앞에 기술
			for (T t : a)
				System.out.printf("%s ", t);
			System.out.println();
		}

		public static <T> T getLast(T[] a) {   // T는 반환 티입
			return a[a.length - 1];
		}
	}

	public static void main(String[] args) {
		Integer[] ia = { 1, 2, 3, 4, 5 };
		Character[] ca = { 'H', 'E', 'L', 'L', 'O' };

		Utils.showArray(ia);  // 제너릭 메소드의 구체적 타입 생략 가능 
		//Utils.<Integer>showArray(ia);
		//Utils.showArray(ca);
		Utils.<Character>showArray(ca); // 호출할 때 구체적 타입 명시해도 됨
		System.out.println(Utils.getLast(ia));
	}
}