import javax.swing.*;
import java.awt.*;

class BorderLayout0 extends JFrame{
	public BorderLayout0() {
		Container ct = getContentPane();
		BorderLayout b = new BorderLayout(10,10);
		ct.setLayout(b);
		
		ct.add(new JButton("버튼1"), BorderLayout.PAGE_START);
		ct.add(new JButton("버튼2"), BorderLayout.CENTER);
		ct.add(new JButton("버튼3"), BorderLayout.PAGE_END);		
		setTitle("BorderLayout Test");
		setSize(200,150);
		setVisible(true);
	}
}

public class BorderLayoutTest {
	public static void main(String[] args) {
		new BorderLayout0();
	}
}



