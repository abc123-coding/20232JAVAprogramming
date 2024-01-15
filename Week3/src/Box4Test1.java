class Box4{
	int width; int height; int depth;
	public Box4(int w, int h, int d) {
		this.width = w;
		this.height = h;
		this.depth = d;
	}
}
public class Box4Test1 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4(10,20,30);
		//Box4 mybox2 = new Box4(); // 명시적 생성자가 이미 존재하면, 묵시적 생성자는 정의해야 사용 가능
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피 : " + vol);
	}
}
