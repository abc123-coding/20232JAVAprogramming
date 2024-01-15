import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTFJTA1 extends JFrame implements ActionListener{
	private JTextField jtf;
	private JTextArea jta;
	private JLabel j1 = new JLabel("입력하십시오");
	
	public JTFJTA1() {
		jtf = new JTextField(20); // 20자 텍스트 객체 
		jta = new JTextArea(10,20); // 10줄 20자 텍스트 객체
		jta.setEditable(false); // 텍스트 에리어 수정 불가
		Container ct =getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel(); // 패널 객체 생성
		p1.add(jtf); // 패널에 추가
		p1.add(jta); // 패널에 추가
		ct.add(p1); // 컨테이너에 페널 추가
		ct.add(j1);
		jtf.addActionListener(this);
		setTitle("JTextField, JTextArea Test1");
		setSize(500,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
	if(jta.getLineCount() <= jta.getRows()) {
		jta.append(ae.getActionCommand() + "\n");
		jtf.setText("");
	}else {
		j1.setText("입력이 종료되었습니다.");
		jtf.setEditable(false);
	}
  }
}

public class JTFJTATest1 {
	public static void main(String[] args) {
		new JTFJTA1();
	}
}

