import javax.swing.*;
import java.awt.*;

class GridLayout0 extends JFrame {
	public GridLayout0() {
		Container ct = getContentPane();
		GridLayout g = new GridLayout(4,3,10,10);
		ct.setLayout(g);
		
		for(int i = 1; i < 11; i++) 
			ct.add(new JButton("레이아웃 " + i));

		setTitle("GridLayout Test");
		setSize(400,200);
		setVisible(true);
	}
}

public class GridLayoutTest {
	public static void main(String[] args) {
		new GridLayout0();
	}
}
