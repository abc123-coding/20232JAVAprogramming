package inheritance;
class OIaa{
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show(String str) 수행: " + str);
	}
}
class OIbb extends OIaa{
	public void show(String str) {
		System.out.println("하위 클래스의 메소드 show 수행: " + str);
	}
}

public class OverridingTest2 {
	public static void main(String[] args) {
		OIbb oibb = new OIbb();
		oibb.show("처음 시작하는 자바");
	}
}
