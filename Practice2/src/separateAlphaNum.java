import java.util.Scanner;

public class separateAlphaNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터를 입력하시오: ");
		String input = sc.nextLine();
		
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				alpha.append(c);
			}
			else if(Character.isDigit(c)) {
				num.append(c);
			}
		}
		System.out.println("\n숫자: " + num.toString());
		System.out.println("문자: " + alpha.toString());
	}
}
