import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class GUI1 extends JFrame implements ActionListener {
	
	JTextArea jta;
	JTextField jtf;
	
	public GUI1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		jta = new JTextArea("파일의 이름을 입력");
		jtf = new JTextField("파일의 내용을 입력");
		JButton jb = new JButton("파일로 저장");
		
		JPanel pl = new JPanel();		
		jb.addActionListener(this);
		
		ct.add(jta);
		pl.add(jtf);
		pl.add(jb);
		ct.add(pl);
		
		
		setTitle("GUI1");
		setSize(300,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			String s = jtf.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(jta.getText());
			fos.close();
			System.out.print(s+"파일이 생성되었습니다.");
		}
		catch(Exception e) {}	
	}
}


public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}
}
