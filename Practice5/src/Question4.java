/* 
 * ‘Stack’을 이용하여 주어진 문자열에 있는 괄호가 올바르게 닫혔는지 확인하는 프로그램을 작성하시오.
 *  여는 괄호 에 대응되는 닫는 괄호 가 존재하고 순서가 올바른지 확인해야 합니다.
 *  예를 들어 '((()))'는 true를 출력하고, ')(' 또는 '(()' 는 false를 출력합니다.
 */
import java.util.*;

public class Question4 {
	
	public static boolean check(String str) {
		
		Stack<Character> s = new Stack<Character>();

		for (int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == '(') 
				s.push('(');
			else {
				if(s.empty()) {
					return false;
				}
				s.pop();
			}
		}
		
		return s.empty();
	}
	
	public static void main(String[] args) {
		
		String expression1 = "((()))";
		String expression2 = "(()";
				
		System.out.println("expression1 : " + check(expression1));
		System.out.println("expression2 : " + check(expression2));
	}
}
