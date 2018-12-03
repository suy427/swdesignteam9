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
		
		GuiInternshipAdd internshipAdd = new GuiInternshipAdd();
		GuiInternshipShow internshipShow = new GuiInternshipShow();
		Gui_InitMngWindow internshipNull = new Gui_InitMngWindow();
		
		internshipNull.intershipNullShow.run();
		//internshipShow.intershipShowShow.run();
		//internshipAdd.internshipAddShow.run();
	}
}
