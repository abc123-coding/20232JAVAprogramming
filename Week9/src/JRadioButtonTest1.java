import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl = new JLabel();
	JCheckBox[] jc = new JCheckBox[5];
	JRadioButton[] jrb = new JRadioButton[5];
	String[] hobby = {"등산","골프","스킨스쿠버","패러글라이딩","수영"};
	String[] age = {"20s", "30s", "40s", "50s", "60s"};
	JLabel jl1 = new JLabel("당신의 취미는?");
	JLabel jl2 = new JLabel("당신의 나이는?");

	
	public JRadioButton1() {
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		
		JPanel hobbypanel = new JPanel();		
		JPanel agepanel = new JPanel();

		
		ButtonGroup gb = new ButtonGroup(); // 라디오  버튼을 버튼 그룹으로 설정
		for(int i= 0; i <5; i++) {
			jrb[i] = new JRadioButton(age[i]);
			jc[i] = new JCheckBox(hobby[i]);
			hobbypanel.add(jc[i]);
			agepanel.add(jrb[i]);
			jc[i].addActionListener(this); // 체크박스 배열 객체에 리스너 등록
			gb.add(jrb[i]); // 버튼 그룹에 객체 추가
		}
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.add(jl1); jp1.add(hobbypanel);
		jp2.add(jl2); jp2.add(agepanel);
		jp3.add(jl); 
		
		ct.add(jp1); ct.add(jp2); ct.add(jp3);
		
		setTitle("JRadioButton Test1");
		setSize(500,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s1 = "당신의 취미는 ";
		String s2 = "당신의 나이는 ";
		for (int i = 0 ; i < 5; i++) {
			if(jc[i].isSelected()) {
				s1= s1+hobby[i]+", ";
			}
			if(jrb[i].isSelected()) {
				s2= s2+age[i]+".";
			}
		}
		jl.setText(s1 + s2);
	}
}

public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}
}
