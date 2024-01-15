package Phone;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;


// 메인 프레임 (전화번호부, 계산기, 게임)
public class MainFrame extends JFrame{
	
	public MainFrame() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(3, 1, 20, 20);
		ct.setLayout(gl);
		JButton jb1 = new JButton("전화번호부");
		JButton jb2 = new JButton("계산기");
		JButton jb3 = new JButton("게임-Up&Down");
		
		jb1.setActionCommand("WhitepagesClicked");
		jb2.setActionCommand("CalculatorClicked");
		jb3.setActionCommand("GameClicked");

		ActionListener buttonClickHandler = new ButtonClickHandler();
		
		jb1.addActionListener(buttonClickHandler);
		jb2.addActionListener(buttonClickHandler);
		jb3.addActionListener(buttonClickHandler);


		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);

		
		setTitle("Phone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,300);
		setVisible(true);
	    setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	class ButtonClickHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if("WhitepagesClicked".equals(command)) {
                 new WhitePages();
			}else if("CalculatorClicked".equals(command)) {
				new Calculator();
			}else if("GameClicked".equals(command)){
				new Game();
			}
		}
	}
}