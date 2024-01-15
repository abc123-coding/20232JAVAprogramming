package inheritance;
import java.util.Scanner;
class Ramyon{
	String ramyon = "라면";
	String water = "물";
	String onion = "대파";
	void boilwater() {
		System.out.println(water+ "을 끓입니다.");
	}
	void cooking() {
		System.out.println(ramyon + "과 " + onion + "를 넣고 끓여 요리 완성! 맛있게 드세요!");
	}
}

class RiceRamyon extends Ramyon{
	String topp = "떡";
	void topping() {
		System.out.println(topp+ "을 넣습니다.");
	}
}

class CheeseRamyon extends Ramyon{
	String topp = "치즈";
	void topping() {
		System.out.println(topp+ "을 넣습니다.");
	}
}

public class RamyonTest {
	public static void main(String args[]) {
		int s;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("무슨 라면? 1.일반라면 2.떡라면 3.치즈라면 99.종료: ");
			s = sc.nextInt();
			if(s==1) {
				Ramyon r = new Ramyon();
				r.boilwater();
				r.cooking();
				
			}else if(s==2) {
				RiceRamyon r = new RiceRamyon();
				r.boilwater();
				r.topping();
				r.cooking();
			}else if(s==3) {
				CheeseRamyon r = new CheeseRamyon();
				r.boilwater();
				r.topping();
				r.cooking();
			}
		}while(s !=99);
		System.out.println("종료");
		
	}
}
