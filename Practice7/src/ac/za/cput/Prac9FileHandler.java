package ac.za.cput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prac9FileHandler {
	
	private BufferedWriter bw;
	private FileWriter fw;

	public void openFile() {
		try { 
		fw = new FileWriter("OutputEmployees", true);
		bw = new BufferedWriter(fw); 
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void processFile(String rec) {
		try {
			bw.write(rec);
			bw.newLine();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void closeFile() {
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
