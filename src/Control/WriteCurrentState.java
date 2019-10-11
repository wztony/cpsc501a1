package Control;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteCurrentState{

	String filename;
	String type;
	private PrintWriter printWriter;
	
	
	public WriteCurrentState() {
		setFileForController("outputFile.txt", "placeholder-type");
	}
	
	public void setFileForController(String filename, String type) {
		this.filename = filename;
		this.type = type;
	}
	
	public void write(double[] numbers, String[] texts) {
		try{
			printWriter = new PrintWriter(new FileOutputStream(filename));
			printWriter.println("input " + type + ": " + numbers[0]);
			printWriter.println("ambient " + type + ": " + numbers[1]);
			printWriter.println("ambient rate: " + numbers[2]);
			printWriter.println("desired " + type + ": " + numbers[3]);
			printWriter.println("desired rate: " + numbers[4]);
			printWriter.println(type + " upper bound: " + numbers[5]);
			printWriter.println(type + " lower bound: " + numbers[6]);
			printWriter.println("refresh rate: " + numbers[7]);
			printWriter.println("--------");
			printWriter.println("current " + type + ": " + texts[0]);
			printWriter.println("current rate: " + texts[1]);
			printWriter.close();
		}catch(FileNotFoundException f){
			System.out.println(f.getMessage());
		}
		
	}
}
