import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainCalculator {

	public static void main(String[] args) {
		
		Calculator culc = new Calculator();
		
		culc.pack();
		culc.setSize(450,550);
		culc.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		culc.setCalculator();
		culc.setVisible(true);

		
	}

}
