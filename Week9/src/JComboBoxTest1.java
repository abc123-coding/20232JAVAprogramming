import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBox1 extends JFrame implements ItemListener{
	JLabel jl = new JLabel();
	JComboBox jcb = new JComboBox();
	String fr[] = {"감","바나나","체리","사과","배"};
	
	public JComboBox1(){
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		for(int i =0 ; i < 5; i++) {
			jcb.addItem(fr[i]);
		}
		
		jcb.addItemListener(this);
		
		ct.add(jcb);
		ct.add(jl);
		
		setTitle("JComboBox Test1");
		setSize(300,100);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		jl.setText(fruit);
	}	
}
public class JComboBoxTest1 {

	public static void main(String[] args) {
		new JComboBox1();
	}

}
