import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Lotto extends JFrame implements ActionListener{
	private JLabel lotto_num = new JLabel();
	private JTextArea area = new JTextArea();
	
	public Lotto() {
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
		area = new JTextArea(10,20);
		JButton lotto = new JButton("로또 번호 자동생성");
		Container ct = getContentPane();
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(lotto);
		jp.add(lotto_num);
		jp.add(area);
		JScrollPane jsp = new JScrollPane(jp,v,h);
		ct.add(jsp, BorderLayout.CENTER);
		lotto.addActionListener(this);
		setTitle("Lotto Number Generate");
		setSize(300,350);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae) {
		Random r = new Random();
		int [] lnum = new int[6];
		int tmp;
		int i = 0;
		a : while(i<6) {
			tmp = r.nextInt(45)+1;
			for(int j= 0; j <= i ; j++) {
				if(tmp == lnum[j])
					continue a;
			}
			lnum[i]=tmp;
			i++;
		}
		lotto_num.setText("이번 주 로또 당첨번호 : " + Arrays.toString(lnum));
		
		String area_text = area.getText();
		if(area_text.isEmpty()) {
			area.setText(Arrays.toString(lnum));
		}else {
			area.setText(area_text + "\n" + Arrays.toString(lnum));
		}
		
		if(area.getLineCount() <= area.getRows()) {
			//area.append(Arrays.toString(lnum) + "\n"); 한방 
		}
		else {
			//lotto_num.setText("프로그램 종료");
			//area.setEditable(false);
		}
	}

}
public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}
