package PracticeExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileOperations {

	public static void main(String[] args) throws Exception {
	  
		FileReader fr=new FileReader("C:\\Users\\xaekka\\Desktop\\demo.txt"); 
		BufferedReader re= new BufferedReader(fr);
		String ab;
		while((ab=re.readLine())!=null) {
			switch(ab) {
			case "Heading 2":
				try {
				FileWriter fw=new FileWriter("C:\\Users\\xaekka\\Desktop\\testout.txt"); 
				BufferedWriter wr= new BufferedWriter(fw);
				while(ab!=null && !ab.matches("Heading 3")) {
					wr.write(ab);
					wr.newLine();
					System.out.println(ab);
					ab=re.readLine();
				}
				wr.close();
				
				}
				catch(Exception e) {
					System.out.println("file is not created");
				
				}
				break;
			}	
		}
				  
		}
	}


