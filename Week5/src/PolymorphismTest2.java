class Item{
	public int price;
}
class Noodle extends Item{
	public Noodle() {
		price = 4500;
	}
	public String toString() {return "국수";}
}
class SauceNoodle extends Item{
	public SauceNoodle() {
		price = 5000;
	}
	public String toString() {return "비빔 국수";}
}
class Wodong extends Item{
	public Wodong() {
		price = 6000;
	}
	public String toString() {return "우동";}
}
class Buyer{
	private int money;
	public Buyer(int m) {
		this.money = m;
	}
	public void buy(Item it, int count) {
		System.out.println(it + "을(를) " + count + " 개 맛있게 먹었습니다.");
		money = money - it.price * count;
		System.out.println("현재 남은 돈: " + money);
	}
}
public class PolymorphismTest2 {
	public static void main(String[] args) {
		Buyer me = new Buyer(50000);
		me.buy(new Noodle(), 2);
		me.buy(new SauceNoodle(), 4);
		me.buy(new Wodong(), 3);
	}
}
