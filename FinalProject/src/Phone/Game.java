package Phone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {
    private int randomNumber;
    private JTextField guessField;
    private JTextArea resultArea;
    private JButton submitButton;
    
    public Game() {
    	
        randomNumber = (int) (Math.random() * 100) + 1; 

        setTitle("Up & Down 게임");
        JPanel inputPanel = new JPanel();
        JLabel guessLabel = new JLabel("숫자를 입력하세요(1~100):");
        guessField = new JTextField(10);
        submitButton = new JButton("확인");

        inputPanel.add(guessLabel);
        inputPanel.add(guessField);
        inputPanel.add(submitButton);

        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
                    int userGuess = Integer.parseInt(guessField.getText());

                    if (userGuess == randomNumber) {
                        resultArea.append("축하합니다! 숫자를 맞췄습니다.\n");
                        guessField.setEnabled(false); 
                        submitButton.setEnabled(false);
                    } else if (userGuess < randomNumber) {
                        resultArea.append("Up! 더 큰 숫자를 입력하세요.\n");
                    } else {
                        resultArea.append("Down! 더 작은 숫자를 입력하세요.\n");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.append("유효한 숫자를 입력하세요.\n");
                }
                guessField.setText(""); // 입력 필드 초기화
            }
        });

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
	    setLocationRelativeTo(null);

    }

}
