import java.awt.Rectangle;

class Rectangle4{
	public int width;
	public int height;
	public Rectangle4(int w, int h) {
		width = w; height = h;
	}
	public int computeRectangleArea() {
		return width * height;
	}
}
class Cube4 extends Rectangle4{
	public int width;
	public int height;
	public int depth;
	public Cube4(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	public int computeCubeVolume(){
		return super.computeRectangleArea()* depth;
	}
	
}


public class CastTest1 {
	public static void main(String[] args) {
		Rectangle4 r = new Cube4(10,20,30);
		System.out.println("밑면의 넓이는 " + r.computeRectangleArea());
		// error 발생. 하위 클래스 메소드 호출 불가능
		//System.out.println("큐브의 부피는 " + r.computeCubeVolume());
		// error 발생. 하위 클래스 객체 번수에 상위 클래스 객체 배정 불가능
		//Cube4 c = new Rectangle4(10,20);
	}
}
