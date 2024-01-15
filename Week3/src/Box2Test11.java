class Box2{
	int width = 10;
	int height = 20;
	int depth = 30;
}
public class Box2Test11 {
	public static void main(String[] args) {
		int myint1 = 100;
		int myint2 = myint1;
		System.out.println("첫 번째 값: " + myint1 + " 두 번째 값: " + myint2);
		myint1 = 200;
		System.out.println("첫 번째 값: " + myint1 + " 두 번째 값: " + myint2); // myint1만 초기화가 됨
		
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2();
		
		mybox1.width = 20;
		mybox2.depth = 123;
		
		System.out.println("mybox1.width: " + mybox1.width);
		System.out.println("mybox1.height: " + mybox1.height);
		System.out.println("mybox1.depth: " + mybox1.depth);
		System.out.println("mybox2.width: " + mybox2.width);
		System.out.println("mybox2.height: " + mybox2.height);
		System.out.println("mybox2.depth: " + mybox2.depth);
		
		// 클래스의 형변환은 두 객체 변수가 같은 장소를 가르킴
		Box2 mybox3 = mybox2;
		mybox2.width = 1000;
		mybox2.height = 2000;
		
		// mybox3 도 mybox2 와 함께 초기화 (두 객체 변수가 같은 장소를 가르키기 때문!)
		System.out.println("mybox3.width: " + mybox3.width);
		System.out.println("mybox3.height: " + mybox3.height);
		System.out.println("mybox3.depth: " + mybox3.depth);
	}

}
