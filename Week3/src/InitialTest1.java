class Initial{
	int number; double rate; String name; int[] score;
	public void aMethod() {
		int count;
		System.out.println(number);
		// System.out.println(count); // 초기화 되지 않은 지역 변수 출력 불가
	}
}
public class InitialTest1 {
	public static void main(String[] args) {
		int var1;
		double var2;
		Initial ob = new Initial();
		//System.out.println("지역변수 var1의 값은: " + var1);
		//System.out.println("지역변수 var2의 값은: " + var2);
		System.out.println("지역변수 number의 값은: " + ob.number + " (int의 묵시적인 값)");
		System.out.println("지역변수 rate의 값은: " + ob.rate + " (double의 묵시적인 값)");
		System.out.println("지역변수 name의 값은: " + ob.name + " (String의 묵시적인 값)");
		System.out.println("지역변수 score의 값은: " + ob.score + " (String의 묵시적인 값)");
		ob.aMethod();
	
	}

}
