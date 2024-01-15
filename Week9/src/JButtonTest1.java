import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButton1 extends JFrame{
	public JButton1() {
		// 이미지 아이콘 객체 생성
		ImageIcon korea = new ImageIcon("image\\korea1.gif");
		ImageIcon usa = new ImageIcon("image\\usa.gif");
		ImageIcon germany = new ImageIcon("image\\germany.gif");
		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa); // 버튼이 눌러졌을 때 나타낼 이미지 생성
		nat.setRolloverIcon(germany); // 버튼 위로 마우스가 지나갈 때 나타나는 이미지 생성
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		setTitle("JButton Test1");
		setSize(500,400);
		setVisible(true);
	}
}
public class JButtonTest1 {
	public static void main(String[] args) {
		new JButton1();
	}
}
