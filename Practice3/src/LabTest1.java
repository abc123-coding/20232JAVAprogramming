import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LabTestEventClass implements ActionListener {
	JLabel jl;
	public LabTestEventClass (JLabel jl){
		this.jl = jl;
	}
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
}

class LabTestEvent extends JFrame {
	JLabel jl;
	JButton jb1, jb2, jb3, jb4;
	public LabTestEvent() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jl = new JLabel();
		jb1 = new JButton("1학년");
		jb2 = new JButton("2학년");
		jb3 = new JButton("3학년");
		jb4 = new JButton("4학년");
		jb1.addActionListener(new LabTestEventClass(jl));
		jb2.addActionListener(new LabTestEventClass(jl));
		jb3.addActionListener(new LabTestEventClass(jl));
		jb4.addActionListener(new LabTestEventClass(jl));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jl);
		setTitle("Lab Test1");
		setSize(300,100); // container 사이즈 넘어가면 label이 자동으로 아래쪽에 출력이 됨.
		setVisible(true);
	}
}

public class LabTest1 {
	public static void main(String[] args) {
		new LabTestEvent();
	}
}
