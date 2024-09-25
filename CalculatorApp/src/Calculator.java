import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

//this class has objects that will implemenet an Action Listener to perform specofic functions
public class Calculator extends JFrame implements ActionListener {

	JTextField textfield;
	
	//declaring an array of number button for the necessary buttons
	JButton[] numButtons = new JButton[10];
	JButton[] functButtons = new JButton[9];
	JButton addBtn, subBtn, divBtn, multBtn;
	JButton decBtn, equalsBtn, delBtn, clrBtn, negBtn;
	char operator;

	//creating an object for the font to use later on
	Font myFont = new Font("Ink Tree", Font.BOLD, 30);

	//declaring Panels that will contain the objects
	JPanel mainPanel, topPanel, centerPanel, bottomBtnPanel;
	
	//declaring and assigning the variables that are going to store the displayed text from the text field window as a double type 
	//to also accommodate when the user wants to add decimals or divide two number that produce a remainder
	double num1 = 0, num2 = 0, result = 0;
	
	Calculator() {

		textfield = new JTextField();
		textfield.setBounds(50, 25, 400, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		addBtn = new JButton("+");
		subBtn = new JButton("-");
		multBtn = new JButton("*");
		divBtn = new JButton("/");
		decBtn = new JButton(".");
		equalsBtn = new JButton("=");
		delBtn = new JButton("Delete");
		clrBtn = new JButton("Clear");
		negBtn = new JButton("(-)");

		functButtons[0] = addBtn;
		functButtons[1] = subBtn;
		functButtons[2] = divBtn;
		functButtons[3] = multBtn;
		functButtons[4] = equalsBtn;
		functButtons[5] = decBtn;
		functButtons[6] = delBtn;
		functButtons[7] = clrBtn;
		functButtons[8] = negBtn;

		for (int i = 0; i < functButtons.length; i++) {
			functButtons[i].addActionListener(this);
			functButtons[i].setFont(myFont);
			functButtons[i].setFocusable(false);
		}

		for (int i = 0; i < numButtons.length; i++) {
			numButtons[i] = new JButton(String.valueOf(i));
			numButtons[i].addActionListener(this);
			numButtons[i].setFont(myFont);
			numButtons[i].setFocusable(false);
		}

		negBtn.setBounds(50,430,100,50); // x:50, y:150, width:100, height:50
		delBtn.setBounds(150, 430, 100, 50);		// x:150, y:150, width:100, height:50
		clrBtn.setBounds(250, 430, 100, 50);		// x:50, y:150, width:100, height:50

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column

		topPanel = new JPanel();
		centerPanel = new JPanel();
		bottomBtnPanel = new JPanel();

		//setting the grid layout of the panel that stores the number buttons and 
		centerPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 4 rows, 4 columns 
//		centerPanel.setBackground(Color.GRAY);

		centerPanel.add(numButtons[1]);
		centerPanel.add(numButtons[2]);
		centerPanel.add(numButtons[3]);
		centerPanel.add(addBtn);

		centerPanel.add(numButtons[4]);
		centerPanel.add(numButtons[5]);
		centerPanel.add(numButtons[6]);
		centerPanel.add(subBtn);

		centerPanel.add(numButtons[7]);
		centerPanel.add(numButtons[8]);
		centerPanel.add(numButtons[9]);
		centerPanel.add(multBtn);

		centerPanel.add(decBtn);
		centerPanel.add(numButtons[0]);
		centerPanel.add(equalsBtn);
		centerPanel.add(divBtn);

		topPanel.setLayout(new GridLayout(1, 1));

		bottomBtnPanel.setLayout(new GridLayout(1, 3));
		bottomBtnPanel.add(delBtn);
		bottomBtnPanel.add(clrBtn);
		bottomBtnPanel.add(negBtn);

		mainPanel.add(textfield);
		mainPanel.add(centerPanel);
//		mainPanel.add(bottomBtnPanel, BorderLayout.PAGE_END);

		this.add(mainPanel);
		this.add(bottomBtnPanel, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}

		if (e.getSource() == decBtn) {
			textfield.setText(textfield.getText().concat("."));
		}

		if (e.getSource() == addBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}

		if (e.getSource() == subBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}

		if (e.getSource() == divBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}

		if (e.getSource() == multBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}

		if (e.getSource() == equalsBtn) {
			num2 = Double.parseDouble(textfield.getText());
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
		}

		if (e.getSource() == clrBtn) {
			textfield.setText("");
		}

		if (e.getSource() == delBtn) {
			String string = textfield.getText();
			textfield.setText("");

			for (int i = 0; i < string.length() - 1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
		}
		
		if(e.getSource()== negBtn) {
			double temp = Double.parseDouble(textfield.getText());
			temp *= -1;
			textfield.setText(String.valueOf(temp)); 
		}
	}
}
