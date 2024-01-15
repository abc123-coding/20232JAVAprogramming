import java.io.*;
import java.util.Scanner;
public class FileWriterTest1 {
	public static void main(String args[]) throws Exception {
		Scanner stdin = new Scanner(System.in);
		String source = "어쩌구저쩌구\n" + "궁시렁궁시렁\n";
		System.out.print("파일명을 입력하세요: ");
		String s =  stdin.next();
		FileWriter fw = new FileWriter(s);
		fw.write(source);
		fw.close();
		System.out.print(s+"파일이 생성되었습니다.");
	}	

}
