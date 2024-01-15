abstract class Figure{
	abstract void draw();
}
class Triangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 삼각형을 그린다.");
	}
}
class Rectangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 사각형을 그린다.");
	}
}
class Oval2 extends Figure{
	public void draw() {
		System.out.println("다형성: 타원을 그린다.");
	}
}
class Polydraw{
	public void pdraw(Figure f) {
		f.draw();
	}
}
/*
	public void draw(Triangle2 t){
		t.draw()
	}
	public void draw(Rectangle2 r){
		r.draw()
	}
	public void draw(Oval2 t){
		o.draw()
	}
*/

public class AbstractTest2 {

	public static void main(String[] args) {
		Polydraw p = new Polydraw();
		Figure fg1 = new Triangle2();
		Figure fg2 = new Rectangle2();
		Figure fg3 = new Oval2();
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);

	}

}
