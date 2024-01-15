import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame{
	public FlowLayout1() {
		Container ct = getContentPane(); // 프레임으로부터 컨테이너 객체 생성
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 10, 15); // 배치관리자 객체 생성
 		ct.setLayout(f1); // 컨테이너에 배치관리자 설정
		
		for(int i = 1 ; i < 15; i++)  
			ct.add(new JButton("버튼"+i)); // 버튼1~14
		
		setTitle("FlowLayout Test1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}
public class FlowLayoutTest1 {
	public static void main(String[] args) {
		new FlowLayout1();	
	}
}
