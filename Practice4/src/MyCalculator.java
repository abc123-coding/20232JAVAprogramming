import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {

    private JLabel jl = new JLabel(" ");
    private String currentInput;
    private double firstNumber;
    private double secondNumber;
    private char operation;

    public Calculator() {
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		
		JPanel p_del = new JPanel(new GridLayout(1,2));
		JPanel p_btn = new JPanel(new GridLayout(4,4));
		
		JButton jb_del = new JButton("C"); 	
		JButton jb_back = new JButton("BackSpace");
		
		JButton jb = new JButton("");
		JButton jb0 = new JButton("0");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb_plus = new JButton("+");
		JButton jb_minus = new JButton("-");
		JButton jb_mul = new JButton("*");
		JButton jb_div = new JButton("/");
		JButton jb_eq = new JButton("=");

		p_del.add(jb_del);
		p_del.add(jb_back);
		
		p_btn.add(jb7);	p_btn.add(jb8);	p_btn.add(jb9);	p_btn.add(jb_plus);
		p_btn.add(jb4);	p_btn.add(jb5);	p_btn.add(jb6);	p_btn.add(jb_minus);
		p_btn.add(jb3);	p_btn.add(jb2);	p_btn.add(jb1);	p_btn.add(jb_mul);
		p_btn.add(jb0);	p_btn.add(jb);	p_btn.add(jb_eq);	p_btn.add(jb_div);
		
		ct.add(jl);
		ct.add(p_del);
		ct.add(p_btn);
		
        jb0.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);

        // Operation buttons
        jb_plus.addActionListener(this);
        jb_minus.addActionListener(this);
        jb_mul.addActionListener(this);
        jb_div.addActionListener(this);
        jb_eq.addActionListener(this);

        // Other buttons
        jb_del.addActionListener(this);
        jb_back.addActionListener(this);

        setTitle("My Calculator");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        double result = 0;
        if (command.equals("C")) { // Clear all values
            jl.setText("");
            firstNumber = 0;
            secondNumber = 0;
            operation = ' ';
        } else if (command.equals("BackSpace")) {
            String currentText = jl.getText();
            if (currentText.length() > 0) {
                jl.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else if (command.equals("0") || command.equals("1") ||command.equals("2") ||
        		command.equals("3") ||command.equals("4") ||command.equals("5") ||
        		command.equals("6") ||command.equals("7") ||command.equals("8") || command.equals("9")) {
            jl.setText(jl.getText() + command);
        } else if (command.equals("+") || command.equals("-") ||command.equals("*") ||command.equals("/")) {
            if (operation == ' ') {
                firstNumber = Double.parseDouble(jl.getText());
                operation = command.charAt(0);
                jl.setText("");
            } 
        }
        else if (command.equals("=")) {
            if (operation != ' ') {
                secondNumber = Double.parseDouble(jl.getText());
                switch (operation) {
                    case '+':
                        firstNumber = firstNumber + secondNumber;
                        break;
                    case '-':
                        firstNumber = firstNumber - secondNumber;
                        break;
                    case '*':
                        firstNumber = firstNumber * secondNumber;
                        break;
                    case '/':
                        if (secondNumber != 0) {
                            firstNumber = firstNumber / secondNumber;
                        } else {
                            jl.setText("Error: Division by zero");
                            return; // exit early if dividing by zero
                        }
                        break;
                }
                jl.setText(String.valueOf(firstNumber)); // Display the result
                operation = ' '; // Reset operation for next calculation
            }
        }
    }
}

public class MyCalculator {
    public static void main(String[] args) {
        new Calculator();
    }
}
