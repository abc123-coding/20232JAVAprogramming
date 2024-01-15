package Phone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class WhitePages extends JFrame {
	
    private DefaultListModel<String> contacts;
    private JList<String> contactsList;
    private JTextField nameField;
    private JTextField numberField;

    public WhitePages() {
   
    	Container ct = getContentPane();
    	ct.setLayout(new FlowLayout());
    	
        // 전체 패널
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // 전화번호부 목록
        contacts = new DefaultListModel<>();
        contactsList = new JList<>(contacts);
        JScrollPane scrollPane = new JScrollPane(contactsList);
        panel.add(scrollPane);

     
        // 이름 입력 필드
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));
        JLabel nameLabel = new JLabel("이름");
        nameField = new JTextField(10);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        panel.add(inputPanel);

        // 전화번호 입력 필드
        JPanel inputPanel2 = new JPanel();
        inputPanel2.setLayout(new BoxLayout(inputPanel2, BoxLayout.LINE_AXIS));
        JLabel numberLabel = new JLabel("전화번호");
        numberField = new JTextField(10);
        inputPanel2.add(numberLabel);
        inputPanel2.add(numberField);
        panel.add(inputPanel2);

        
        // 라디오 버튼 - 카테고리(가족, 친구, 업무, 기타)
        // 수평방항 패널에 라디오 버튼을 다 넣고, 전체 패널에 라디오버튼패널 추가
        JPanel horizontalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        JRadioButton opt1= new JRadioButton("가족");
        JRadioButton opt2= new JRadioButton("친구");
        JRadioButton opt3= new JRadioButton("업무");
        JRadioButton opt4= new JRadioButton("기타");
        
        ButtonGroup group = new ButtonGroup();
        group.add(opt1); group.add(opt2); group.add(opt3); group.add(opt4);
        horizontalPanel.add(opt1); horizontalPanel.add(opt2); horizontalPanel.add(opt3); horizontalPanel.add(opt4);

        panel.add(horizontalPanel);
        
        
        // 추가 버튼
        JButton addButton = new JButton("추가");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	String name = nameField.getText();
                String number = numberField.getText();
     
                JRadioButton selectedRadioButton = getSelectedRadioButton(group);
                String relation = (selectedRadioButton != null) ? selectedRadioButton.getText() : null;
                
                if (!name.isEmpty() && !number.isEmpty() && relation != null ) {
                    String contact = name + "(" + relation + "): " + number ;
                    contacts.addElement(contact);
                    nameField.setText("");
                    numberField.setText("");
                    group.clearSelection();
                }else {
                    JOptionPane.showMessageDialog(WhitePages.this, "모든 정보를 입력해주세요.", "주의", JOptionPane.WARNING_MESSAGE);                
                }
            }
        });
        panel.add(addButton);

        // 삭제 버튼
        JButton removeButton = new JButton("삭제");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = contactsList.getSelectedIndex();
                if (selectedIndex != -1) {
                    contacts.remove(selectedIndex);
                }
            }
        });
        panel.add(removeButton);
        
        ct.add(panel);
        setTitle("전화번호부");
        pack();
        setVisible(true);
	    setLocationRelativeTo(null);

    }
    
    
    // 라디오 버튼에서 텍스트 가져오는 메소드
    private static JRadioButton getSelectedRadioButton(ButtonGroup group) {
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            JRadioButton button = (JRadioButton) buttons.nextElement();
            if (button.isSelected()) {
                return button;
            }
        }
        return null;
    }

}