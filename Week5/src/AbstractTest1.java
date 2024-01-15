abstract class Shape{
	abstract void draw();
	abstract void computeArea(double a, double d);
}
class Rectangle1 extends Shape{
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	void computeArea(double h, double v) {
		System.out.println("사각형의 넓이: " + (h*v));
	}
}
class Triangle1 extends Shape{
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
	void computeArea(double h, double v) {
		System.out.println("삼각형의 넓이: " + (h*v/2) );
	}
}
public class AbstractTest1 {
	public static void main(String[] args) {
		System.out.println("==추상 메소드를 이용한 다형성==");
		Shape s = new Rectangle1();
		s.draw();
		s.computeArea(5, 10);
		s = new Triangle1();
		s.draw();
		s.computeArea(5, 10);
	}
}
