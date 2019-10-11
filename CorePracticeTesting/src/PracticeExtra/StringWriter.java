package PracticeExtra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		String ab ="Welcome to javaTpoint.";
		FileWriter writer = new FileWriter("C:\\Users\\xaekka\\Desktop\\testout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write(ab);  
	    buffer.close();  
	    System.out.println("Success");

	}

}
