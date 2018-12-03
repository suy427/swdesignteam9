package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.GuiInternshipNull.show;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JRadioButton;

public class GuiInternshipShow extends JFrame {

	private JPanel contentPane;
	File file = new File("internship.txt");

	public class show extends Thread {
		public void run() {
			GuiInternshipShow frame = new GuiInternshipShow();
			frame.setVisible(true);
		}
	}
	
	show intershipShowShow = new show();

	/**
	 * Create the frame.
	 */
	public GuiInternshipShow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("인턴 프로그램 목록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_1.add(verticalBox_1);
		
		JButton button_1 = new JButton("인턴프로그램 추가");
		button_1.setAlignmentY(Component.TOP_ALIGNMENT);
		verticalBox_1.add(button_1);
		button_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_2 = new JPanel();
		verticalBox_1.add(panel_2);
		
		Box verticalBox = Box.createVerticalBox();
		panel_2.add(verticalBox);
		
		/////////////////////////////////////////////////////////////////////////
		
		try{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String line = "";
			
			while((line = bufReader.readLine()) != null){
				
			}
			bufReader.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_1);
		
		JLabel lbprogramName = new JLabel("Program Name");
		horizontalBox_1.add(lbprogramName);
		
		JLabel programName = new JLabel("                      ");
		horizontalBox_1.add(programName);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_2);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		horizontalBox_2.add(lblCompanyName);
		
		JLabel companyName = new JLabel("                      ");
		horizontalBox_2.add(companyName);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_3);
		
		JLabel lblWorkingCompany = new JLabel("Working Country");
		horizontalBox_3.add(lblWorkingCompany);
		
		JLabel workingCompany = new JLabel("                      ");
		horizontalBox_3.add(workingCompany);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		horizontalBox_4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_4);
		
		JLabel lblClosingDate = new JLabel("Closing Date");
		horizontalBox_4.add(lblClosingDate);
		
		JLabel closingDate = new JLabel("                      ");
		horizontalBox_4.add(closingDate);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		horizontalBox_5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_5);
		
		JLabel lblWorkingTerm = new JLabel("Working Term");
		horizontalBox_5.add(lblWorkingTerm);
		
		JLabel workingTerm = new JLabel("                      ");
		horizontalBox_5.add(workingTerm);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		horizontalBox_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_6);
		
		JLabel lblWage = new JLabel("Wage");
		horizontalBox_6.add(lblWage);
		
		JLabel wage = new JLabel("                      ");
		horizontalBox_6.add(wage);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		horizontalBox_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_7);
		
		JLabel lblYear = new JLabel("Minimum Year");
		horizontalBox_7.add(lblYear);
		
		JLabel minimumYear = new JLabel("                      ");
		horizontalBox_7.add(minimumYear);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(1.0f);
		verticalBox.add(horizontalBox);
		
		JLabel lblPosition = new JLabel("Position");
		horizontalBox.add(lblPosition);
		
		JLabel position = new JLabel("                      ");
		horizontalBox.add(position);
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		horizontalBox_9.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_9);
		
		JLabel lblMinimumGpa = new JLabel("Minimum GPA");
		horizontalBox_9.add(lblMinimumGpa);
		
		JLabel minimumGpa = new JLabel("          ");
		horizontalBox_9.add(minimumGpa);
		
		Box horizontalBox_10 = Box.createHorizontalBox();
		horizontalBox_10.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_10);
		
		JLabel lblMajorCondition = new JLabel("Major condition");
		horizontalBox_10.add(lblMajorCondition);
		
		JLabel majorCondition = new JLabel("          ");
		horizontalBox_10.add(majorCondition);
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		horizontalBox_8.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_8);
		
		JLabel lblEnglishSkill = new JLabel("English Level");
		horizontalBox_8.add(lblEnglishSkill);
		
		JRadioButton rdbtnHigh = new JRadioButton("High");
		horizontalBox_8.add(rdbtnHigh);
		
		JRadioButton rdbtnMideum = new JRadioButton("Mideum");
		horizontalBox_8.add(rdbtnMideum);
		
		JRadioButton rdbtnLow = new JRadioButton("Low");
		horizontalBox_8.add(rdbtnLow);
		
		Box horizontalBox_button = Box.createHorizontalBox();
		horizontalBox_button.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_button);
		
		JButton btnNewButton = new JButton("수정");
		horizontalBox_button.add(btnNewButton);
		
		JButton button = new JButton("삭제");
		horizontalBox_button.add(button);
		////////////////////////////////////////////////////////////////////////////
	}

}
