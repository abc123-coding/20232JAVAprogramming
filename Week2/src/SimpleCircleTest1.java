import java.util.Scanner;

class SimpleCircle {
	static final double PI = 3.14159;
}
public class SimpleCircleTest1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        int radius = scanner.nextInt();
        
        double area = radius * radius * SimpleCircle.PI ;
        
        System.out.println("원의 반지름은: " + radius);
        System.out.println("원의 넓이는: " + area);
        
        scanner.close();
		
	}
}