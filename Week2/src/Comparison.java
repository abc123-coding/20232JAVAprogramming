public class Comparison {

	// 정수형 매개변수를 받는 max 메소드
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // 실수형 매개변수를 받는 max 메소드
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        int intNum1 = 25;
        int intNum2 = 20;
        double doubleNum1 = 15.5;
        double doubleNum2 = 18.3;

        // 정수를 비교하는 max 메소드 호출
        int maxInt = max(intNum1, intNum2);
        System.out.println("두 정수 중 큰 수는: " + maxInt);

        // 실수를 비교하는 max 메소드 호출
        double maxDouble = max(doubleNum1, doubleNum2);
        System.out.println("두 실수 중 큰 수는: " + maxDouble);
    }
}
