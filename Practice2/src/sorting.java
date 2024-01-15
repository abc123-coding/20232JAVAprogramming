import java.util.Arrays;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		System.out.println("==사용자 입력 데이터==");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] data = input.split(" ");
		Arrays.sort(data);
		
		System.out.println("==정렬후 데이터==");
		for(String a: data) {
			System.out.print(a + " ");
		}
	}
}
