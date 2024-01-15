// 어려워... 상속, 다형성을 완벽하게 이해해야 generic class 이해할 수 있음
package generic.cls;

import java.util.ArrayList;

public class GenericInheritanceDemo {
	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beer());
		beverageTest(list1); // ArrayList<Beverage> 타입의 객체이기 때문에 정상적으로 실행됨
		
		ArrayList<Beverage> list2 = new ArrayList<>();
		list1.add(new Beer());
		beverageTest(list1); // ArrayList<Beer>는 ArrayList<Beverage>의 자식 타입이 아니므로 컴파일 에러
	}
	
	static public void beverageTest(ArrayList<? extends Beverage> list) { // <? extend> 상속된 타입은 다 허용

	}
}