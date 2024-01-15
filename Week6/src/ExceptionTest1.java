import java.io.*;
public class ExceptionTest1 {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1)
				System.out.print((char)i);
			file.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("예외 처리 루틴: " + e + " 파일이 존재하지 않는다.");
		}
		catch(IOException e) {
			System.out.println("예외 처리 루틴: " + e.getMessage() + " 파일이 존재하지 않는다.");
		}
		finally {
			System.out.println("프로그램이 종료");		
		}
	}
}
