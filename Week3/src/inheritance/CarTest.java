package inheritance;
import java.util.Scanner;
class Engine{
	String capacity;
	String fuel;
	private int price = 20000000;
	public Engine(int cc, int fuel) {
		if(cc==1) {
			capacity = "2000cc 미만";
			price += 0;
		}
		else {
			capacity = "2000cc 이상";
			price += 10000000;
		}
		if(fuel ==1) {
			this.fuel = "가솔린";
			price += 5000000;
		}
		else {
			this.fuel = "디젤";
		}
	}
	public int getPrice() {
		return price;
	}
}
class Car{
	String color;
	Engine e;
	public Car(String c, int cc, int fuel) {
		color = c;
		e = new Engine(cc,fuel);
	}
	public String getPrice(){
		return "당신이 요청한 " + e.capacity + "와 "  + e.fuel + " 차량의(색상: " + color + ")의 가격은 " + e.getPrice() + "원 입니다.";
	}
}
public class CarTest {
	public static void main(String[] args) {
		String color; int cc; int fuel;
		System.out.print("구입하고 싶은 차의 배기량은? (1:2000cc 미만, 2:2000cc 이상): ") ;
		Scanner sc = new Scanner(System.in);
		cc = sc.nextInt();
		System.out.print("차의 연료는? (1:가솔린, 2:디젤): ") ;
		fuel = sc.nextInt();
		System.out.print("차의 색상은?: ") ;
		Scanner sc2= new Scanner(System.in);
		color = sc2.next();
		Car c = new Car(color, cc, fuel);
		System.out.println(c.getPrice());
		System.out.println("차량의 가격은 " + c.e.getPrice());
		sc.close();
	}

}
