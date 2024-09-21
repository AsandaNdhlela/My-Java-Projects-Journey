import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class example {
	
	private ObjectOutputStream output;
	private FileOutputStream fileOut;
	
	public example(String name, String surname, int studentNo) throws IOException {
		
	
	fileOut = new FileOutputStream("Thando's.ser");
	output = new ObjectOutputStream(fileOut);
	}

}
