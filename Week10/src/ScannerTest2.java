import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		try{ 
			System.out.print("검색을 원하는 학생의 학번을 입력하세요 : ");
			int id = p.nextInt();
			Scanner s = new Scanner(new File("phone.txt"));
			while(s.hasNext()) {
				if(id == s.nextInt()) {
					System.out.println(id + "학생의 전화번호 : " + s.nextInt());
					return;
				}
				else
					s.next();
		}
		System.out.println("학생의 번호가 저장되어 있지 않습니다.");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
