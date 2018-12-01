package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IntershipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test test_add = new test();
		test2 test_modify = new test2();
		test3 test_null = new test3();
		
		/*
		File internshipList = new File("internshipList.txt");
		FileWriter writer = null;
		*/
		/*
		try {
			writer = new FileWriter(internshipList, true);
			writer.write("");
			writer.flush();
			
			test_null.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		test_null.d.run();

	}
}
