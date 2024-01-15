// this 의 필요성
class Box{
	int width; int height; int depth;
	public Box(int width, int height, int depth) {
		//width = width;
		//height = height;
		//depth = depth;
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class BoxTest {
	public static void main(String[] args) {
		Box mybox = new Box(10,20,30);
		System.out.println(mybox.width);
	}
}
