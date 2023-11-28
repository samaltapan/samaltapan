package main.java.assignment.com.file;

import java.util.Scanner;

public class ProcessInputFile {

	public static void main(String[] args) {
		Scanner io =  null;
		try {
			io =new Scanner(System.in);
			String path = io.next();
			if(path != null || "".equals(path)) {
				System.out.println("Error :  Path for input file can't be empty");
			}
			EnrichInputProcessFile enrichInputProcessFile =  new EnrichInputProcessFile();
			enrichInputProcessFile.processInputFile(path);
		} catch (Exception e) {
			System.out.println("Exception while processing input file");
			e.printStackTrace();
		}finally {
			io.close();
		}	
	}

}
