import java.util.Scanner;

class Odd {
    public int calculateOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
class OddEven extends Odd {
    public int calculateEvenSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
public class OddEvenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();
        
        OddEven calculator = new OddEven();
        
        int oddSum = calculator.calculateOddSum(n);
        int evenSum = calculator.calculateEvenSum(n);
        
        System.out.println("짝수의 합: " + evenSum);
        System.out.println("홀수의 합: " + oddSum);
        
        scanner.close();
    }
}
