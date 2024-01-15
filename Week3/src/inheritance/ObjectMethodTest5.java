package inheritance;
class Box11{
	public int width;
	public int height;
	public int depth;
	public Box11(int w, int h, int d) {
		width = w; 
		height = h;
		depth = d;
	}
	public boolean equals(Box11 b) {
		return (this.width == b.width && this.height == b.height && this.depth == b.depth);
	}
}
public class ObjectMethodTest5 {
	public static void main(String[] args) {
		Box11 b1 = new Box11(10,20,30);
		Box11 b2 = new Box11(10,20,30);
		Box11 b3 = b2;
		System.out.println(b1.equals(b2) ? "b1==b2" : "b1!=b2");
		System.out.println(b2.equals(b3) ? "b2==b3" : "b2!=b3");
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		System.out.println(s1.equals(s2) ? "s1==s2" : "s1!=s2");
	}
}
