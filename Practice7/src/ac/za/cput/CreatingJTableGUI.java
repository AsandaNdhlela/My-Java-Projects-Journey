package ac.za.cput;
import java.awt.BorderLayout;

//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class CreatingJTableGUI extends JFrame implements ActionListener {

	private JLabel department, firstName, lastName, employmentType, empty;
	private JTextField firstNameTxt, lastNameTxt;
	@SuppressWarnings("rawtypes")
	private JComboBox departmentComboBox;
	private JButton exitBtn, saveToFile;
	private JRadioButton permanentBtn, temporaryBtn;
	private JPanel mainPanel, detailsPanel, radioButtonsPanel, tablePanel, buttonsPanel;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	private ButtonGroup group;

	@SuppressWarnings("rawtypes")
	public CreatingJTableGUI() {
		super("University Staff Application");

		// creating labels objects
		department = new JLabel("Department");
		firstName = new JLabel("First name");
		lastName = new JLabel("Last Name");
		employmentType = new JLabel("Employment Type");
		empty = new JLabel();

		// creating combo box object
		departmentComboBox = new JComboBox();

		// creating text fields objects
		firstNameTxt = new JTextField();
		lastNameTxt = new JTextField();

		// Creating radio button objects
		permanentBtn = new JRadioButton("Permanent");
		temporaryBtn = new JRadioButton("Temporary");
		temporaryBtn.setBounds(1000, 300, WIDTH, HEIGHT);

		// creating Table objects
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		add(scrollPane);

		// Creating buttons Objects
		// addToTableBtn = new JButton("Save to file");
		saveToFile = new JButton("Save to file");

		exitBtn = new JButton("Exit");

		// creating Panel Objects
		mainPanel = new JPanel();
		detailsPanel = new JPanel();
		tablePanel = new JPanel();
		buttonsPanel = new JPanel();
		radioButtonsPanel = new JPanel();
	}

	@SuppressWarnings("unchecked")
	public void setCreatingJTableGUI() {
		// SETTING UP THE MAIN PANEL TO ACCOMMODATE EVERYTHING USING THE GRID LAYOUT
		mainPanel.setLayout(new GridLayout(4, 1)); // 4 rows and 1 column

		// setting p the details panel
		detailsPanel.setLayout(new GridLayout(3, 1)); // 3 rows and 1 column

		// adding elements in the detailsPanel
		detailsPanel.add(department);
		detailsPanel.add(departmentComboBox);
		// combo box items
		departmentComboBox.addItem("select");
		departmentComboBox.addItem("Graphic Design");
		departmentComboBox.addItem("Civil Engineering");
		departmentComboBox.addItem("Information Technology");

		detailsPanel.add(firstName);
		detailsPanel.add(firstNameTxt);
		detailsPanel.add(lastName);
		detailsPanel.add(lastNameTxt);

		// setting the Panel to accommodate the radio buttons using a grid layout
		radioButtonsPanel.setLayout(new GridLayout(2, 1)); // 2 rows and 1 column

		radioButtonsPanel.add(employmentType);

		// creating a button group object to have the functionality of having having to
		// select one radio button at once
		group = new ButtonGroup();
		// adding the buttons to one group
		group.add(permanentBtn);
		permanentBtn.addActionListener(this);
		group.add(temporaryBtn);
		temporaryBtn.addActionListener(this);

		radioButtonsPanel.add(permanentBtn);
		radioButtonsPanel.add(empty);
		radioButtonsPanel.add(temporaryBtn);

		// setting the panel to accommodate the table
		tablePanel.setLayout(new GridLayout(2, 2));
		tableModel.addColumn("Department");
		tableModel.addColumn("First name");
		tableModel.addColumn("Surname");
		tableModel.addColumn("Employment Type");
//		tableModel.addRow(new Object[] { "Civil Engineering","Asanda","Ndhlela","Permanent" });
//		tablePanel.add(table);

		// setting the buttonsPanel to accommodate the button ( Add to table button and
		// the Exit button)
		buttonsPanel.setLayout(new GridLayout(1, 2)); // 1 row and 2 columns

		// adding the buttons to the buttonsPanel
		buttonsPanel.add(saveToFile);
		buttonsPanel.add(exitBtn);

		// adding an Action Listener for the buttons
		saveToFile.addActionListener(this);
		exitBtn.addActionListener(this);

		// adding the panels to the main frame of the GUI in the order specified by the
		// design
		mainPanel.add(detailsPanel);
		mainPanel.add(radioButtonsPanel);
//		mainPanel.add(tablePanel);

		// adding the main panel that accommodates all panels to the frame
		this.add(mainPanel, BorderLayout.NORTH);
//		this.add(tablePanel);
//		adding the buttons at the end of the frame and after the main panel as a stand alone panel
		this.add(buttonsPanel, BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// creating an object of the Prac9FileHandler class that contains the methods
		// necessary to open, write and close the file
		Prac9FileHandler fileHandle = new Prac9FileHandler();

		// creating the variable to store the necessary values to be added to the table
		String employType = "";
		String department = "";
		String name = null;
		String surname = null;

		// checking if the texts field are empty or not when save to file button is
		// clicked, if so display a message using JOptionPane method
		if (e.getSource() == saveToFile && lastName.getText().isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "The texts fields are empty");
		}

		if (e.getSource() == saveToFile && departmentComboBox.getSelectedItem().toString() != "select") {
			// opening the file
			fileHandle.openFile();

			// getting the values/ inputs from the text fields and assigning them to
			// necessary variables
			department = departmentComboBox.getSelectedItem().toString();
			name = firstNameTxt.getText();
			surname = lastNameTxt.getText();

			// checking first if the permanentBtn is selected using the isSelected method
			if (permanentBtn.isSelected()) {
				// getting the value of the radio button and assigning it to the employType
				// variable
				employType = permanentBtn.getText();
			}
			// checking first if the temporaryBtn is selected using the isSelected method
			if (temporaryBtn.isSelected()) {
				// getting the value of the radio button and assigning it to the employType
				// variable
				employType = temporaryBtn.getText();
			}
			// adding the row to the table using the addRow method
			tableModel.addRow(new Object[] { department, name, surname, employType });

			// creating a string for all the details from the table
			String fileDetails = department + "#" + name + "#" + surname + "#" + employType;

			// adding the details to a the file, using one variable as string data type
			fileHandle.processFile(fileDetails);

			// closing the file
			fileHandle.closeFile();

		}

		// after adding to the table this If clears the text fields
		if (e.getActionCommand().equals("saveToFile")) {
			// setting the text fields to an empty string
			firstNameTxt.setText("");
			lastNameTxt.setText("");
			// re-selecting the item on the first index
			departmentComboBox.setSelectedIndex(0);
			// clear the radio buttons selection
			group.clearSelection();
		}

		// if the EXIT BUTTON IS CLICKED the GUI exits
		if (e.getSource() == exitBtn) {
			System.exit(0);

		}
	}

}
