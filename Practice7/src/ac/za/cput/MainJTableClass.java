package ac.za.cput;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class MainJTableClass {


	public static void main(String[] args) {
		CreatingJTableGUI tableGUI = new CreatingJTableGUI();
		
		tableGUI.pack();
		tableGUI.setSize(500,500);
		tableGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tableGUI.setCreatingJTableGUI();
		tableGUI.setVisible(true);
		
	}

}
