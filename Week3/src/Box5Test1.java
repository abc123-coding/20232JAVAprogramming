class Box5{
	int width; int height; int depth; int volume;

	// 생성자 오버로딩
	public Box5() {
		this(1,1,1);
	}
	public Box5(int w) {
		this(w,1,1);
	}
	public Box5(int w, int h) {
		this(w,h,1);
	}
	public Box5(int w, int h, int d) {
		this.width = w;
		this.height = h;
		this.depth = d;
		this.volume = width * height * depth;
	}
}

public class Box5Test1 {
	public static void main(String[] args) {
		Box5 mybox1 = new Box5();
		Box5 mybox2 = new Box5(10);
		Box5 mybox3 = new Box5(10,20);
		Box5 mybox4 = new Box5(10,20,30);
		
		System.out.println("mybox1 부피: " + mybox1.volume);
		System.out.println("mybox2 부피: " + mybox2.volume);
		System.out.println("mybox3 부피: " + mybox3.volume);
		System.out.println("mybox4 부피: " + mybox4.volume);
	}
}
