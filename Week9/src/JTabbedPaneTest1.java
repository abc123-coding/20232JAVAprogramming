import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioPanel extends JPanel implements ActionListener{
	
	JLabel jl1 = new JLabel("당신의 성별은?");
	JLabel jl2 = new JLabel("");
	
	public RadioPanel() {
		JRadioButton jrb1 = new JRadioButton("남자");
		JRadioButton jrb2 = new JRadioButton("여자");
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		jl2.setText(s);
	}	
}

class ComboPanel extends JPanel implements ItemListener{
	JLabel jl1 = new JLabel("당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	
	public ComboPanel() {
		JComboBox jcb = new JComboBox();
		jcb.addItem("A");
		jcb.addItem("B");
		jcb.addItem("AB");
		jcb.addItem("O");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}

class JTabbedPane1 extends JFrame{
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		RadioPanel rp = new RadioPanel();
		ComboPanel cp = new ComboPanel();
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		Container ct = getContentPane();
		ct.add(jtp);
		setTitle("JTabbedPane Test1");
		setSize(500,150);
		setVisible(true);
	
	}
	
}
public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabbedPane1();
	}

}
