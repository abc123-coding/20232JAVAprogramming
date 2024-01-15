// 하위 클래스에 생성자가 없거나 묵시적 생성자가 있는 경우, 하위 클래스로부터 객체가 생성될 때 상위 클래스의 묵시적 생성자가 먼저 수행
package inheritance;
class DA1{
	public double d1;
	public DA1() {
		System.out.println("클래스 DA1의 묵시적 생성자 수행");
		d1 = 10 * 10;
	}
}
class DA2 extends DA1{
	public double d2;
	public DA2() {
		System.out.println("클래스 DA2의 묵시적 생성자 수행");
		d2 = 10 * 10 * 10;	
	}
}
class DA3 extends DA2{
	public double d3;
	public DA3() {
		System.out.println("클래스 DA3의 묵시적 생성자 수행");
		d3 = 10 * 10 * 10 * 10;	
	}
}
public class DefaultInheritanceTest1 {
	public static void main(String[] args) {
		DA3 super1= new DA3();
		System.out.println("10의 2제곱: " + super1.d1);
		System.out.println("10의 3제곱: " + super1.d2);
		System.out.println("10의 4제곱: " + super1.d3);
		DA2 super2 = new DA2();
	}

}
