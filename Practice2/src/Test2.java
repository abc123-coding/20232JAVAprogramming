class TestTest{
	private String text;
	
	public TestTest(String s) {
		this.text = s;
	}
	
	public String getText() {
		return text;
	}
}
public class Test2 {

	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		// private 변수인 text에 직접 접근을 시도해서 error 발생 -> public 변수로 수정
		System.out.println(test.getText().toLowerCase());
	}
}