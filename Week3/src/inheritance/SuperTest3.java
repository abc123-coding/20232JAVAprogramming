package inheritance;
class SD1{
	public int i1;
	public double d1;
	public SD1(int i1) {
		System.out.println("SD1(int i1) 생성자 수행");
		this.i1 = i1*i1;
		System.out.println(i1 + "의 제곱 값은 " + this.i1);
	}
	public SD1(double d1) {
		System.out.println("SD1(double i1) 생성자 수행");
		this.d1 = d1*d1;
		System.out.println(d1 + "의 제곱 값은 " + this.d1);
	}
}
class Sub1 extends SD1{
	public Sub1(int i1) {
		super(i1); // 상위 클래스 생성자 호출
		System.out.println("Sub1(int i1) 생성자 수행");
		this.i1 = this.i1 * i1;
		System.out.println(i1 + "의 3제곱은 " + this.i1);
	}
	
	public Sub1(double d1) {
		super(d1); // 상위 클래스 생성자 호출
		System.out.println("Sub1(double i1) 생성자 수행");
		this.d1 = this.d1 * d1;
		System.out.println(d1 + "의 3제곱은 " + this.d1);
	}
}
public class SuperTest3 {
	public static void main(String[] args) {
		Sub1 sub1 = new Sub1(10);
		Sub1 sub2 = new Sub1(10.5);	

	}

}
