import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		/*
		ArrayList box = new ArrayList(); // raw type
		box.add("전체 박스");
		box.add(new Box("white",3,3,3));
		box.add(new Box("red", 5,5,5));
		box.add(new Box("black",7,7,7));
		System.out.println(box.get(0) + " : " + box.subList(1, 4));
		for(int i = 1 ; i < box.size(); i++) {
			Box b = (Box)box.get(i);
			System.out.println(b.color + " 박스의 부피는 " + b.vol);
		}
		*/
		
		ArrayList<Box> box = new ArrayList<Box>();
		// box.add("전체 박스") // 오류 발생. Box형만 가능
		box.add(new Box("white",3,3,3));
		box.add(new Box("red",5,5,5));
		box.add(new Box("black",7,7,7));
		System.out.println("초기 값: " + box);
		for(Box b : box) {
			System.out.println(b.color + " 박스의 부피는 " + b.vol);
		}
		Collections.sort(box);
		for(Box b : box) {
			System.out.println(b.color + " 박스의 부피 크기 순: " + b.vol);
		}
		Collections.reverse(box);
		for(Box b : box) {
			System.out.println(b.color + " 박스의 부피 크기 순: " + b.vol);
		}
	}
}
/*
class Box {
	
	String color;
	public int vol;
	
	public Box(String c, int w, int d, int h) {
		color = c;
		vol = w*d*h;
	}
	
	@Override public String toString() {
		return color+"박스";
	}
}
*/

class Box implements Comparable<Box>{
	String color;
	public int vol;
	
	public Box(String c, int w, int d, int h) {
		color = c;
		vol = w*d*h;
	}
	
	@Override 
	public String toString() {
		return color + "박스";
	}
	
	@Override 
	public int compareTo(Box box) {
		return Integer.compare(this.vol,  box.vol);
	}
}