import java.io.*;

public class SerFileHandler {
	
	private static ObjectOutputStream output;
	
	public static void openSerFile(String filename) {
		try {
			output = new ObjectOutputStream(new FileOutputStream(filename));
		} catch (IOException err) {
			System.out.println("Error: " + err);

		}
	}
	
	public static void processSerFile(Customer obj) {
		try {
			output.writeObject(obj);
		}catch(IOException err) {
			System.out.println("Error: " + err);
		}
	}
	
	public static void closeOutputSerFile() {
		try {
			output.close();
			
		}catch(IOException err) {
			System.out.println("Error: "+ err);
		}
	}
	

}
