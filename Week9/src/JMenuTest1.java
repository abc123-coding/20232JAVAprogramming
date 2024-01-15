import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf ;
	public JMenu1(){
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		JMenuBar jmb = new JMenuBar();
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편잡");
		
		JMenuItem jmi = new JMenuItem("새 파일");
		jmi.addActionListener(this);
		menu1.add(jmi);
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		jmb.add(menu1);
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);

		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi);
		
		jmb.add(menu2);
		setJMenuBar(jmb);
		jtf = new JTextField(20);
		
		ct.add(jtf, BorderLayout.SOUTH);
		
		setTitle("JMenu Test1");
		setSize(400, 200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}
public class JMenuTest1 {

	public static void main(String[] args) {
		new JMenu1();
	}

}
