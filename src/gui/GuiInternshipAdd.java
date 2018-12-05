package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import application.ProgramInformation;
import application.InternshipProgram;
import application.Period;
import gui.GuiInternshipNull.show;

public class GuiInternshipAdd extends JFrame {

	private JPanel contentPane;
	private JTextField programName;
	private JTextField companyName;
	private JTextField workingCountry;
	private JTextField closingDate;
	private JTextField startDate;
	private JTextField endDate;
	private JTextField wage;
	private JTextField minYear;
	private JTextField position;
	private JTextField minGPA;
	private JTextField majorCondition;
	private JTextField extraRequirement;
	
	//private Integer programID = 0;
	
//	public void setAddProgramID(int programId){
//		this.programID = programId;
//	}

	public class show extends Thread {
		public void run() {
			GuiInternshipAdd frame = new GuiInternshipAdd();
			frame.setVisible(true);
		}
	}
	
	show internshipAddShow = new show();
	/**
	 * Create the frame.
	 */
	public GuiInternshipAdd() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("인턴쉽 프로그램 등록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_1.add(verticalBox_1);
		
		JPanel panel_2 = new JPanel();
		verticalBox_1.add(panel_2);
	
		Box verticalBox = Box.createVerticalBox();
		panel_2.add(verticalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_1);
		
		JLabel lbprogramName = new JLabel("Program Name");
		horizontalBox_1.add(lbprogramName);
		
		programName = new JTextField();
		horizontalBox_1.add(programName);
		programName.setColumns(10);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_2);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		horizontalBox_2.add(lblCompanyName);
		
		companyName = new JTextField();
		horizontalBox_2.add(companyName);
		companyName.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_3);
		
		JLabel lblWorkingCompany = new JLabel("Working Country");
		horizontalBox_3.add(lblWorkingCompany);
		
		workingCountry = new JTextField();
		horizontalBox_3.add(workingCountry);
		workingCountry.setColumns(10);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		horizontalBox_4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_4);
		
		JLabel lblClosingDate = new JLabel("Closing Date");
		horizontalBox_4.add(lblClosingDate);
		
		closingDate = new JTextField();
		horizontalBox_4.add(closingDate);
		closingDate.setColumns(10);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		horizontalBox_5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_5);
		
		JLabel lblWorkingPeriod = new JLabel("Working Period");
		horizontalBox_5.add(lblWorkingPeriod);
		
		Box horizontalBox_start = Box.createHorizontalBox();
		horizontalBox_start.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_start);
		
		JLabel lblStartDate = new JLabel("Start Date");
		horizontalBox_start.add(lblStartDate);
		
		startDate = new JTextField();
		horizontalBox_start.add(startDate);
		startDate.setColumns(10);
		
		Box horizontalBox_end = Box.createHorizontalBox();
		horizontalBox_end.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_end);
		
		JLabel lblEndDate = new JLabel("End Date");
		horizontalBox_end.add(lblEndDate);
		
		endDate = new JTextField();
		horizontalBox_end.add(endDate);
		endDate.setColumns(10);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		horizontalBox_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_6);
		
		JLabel lblWage = new JLabel("Wage");
		horizontalBox_6.add(lblWage);
		
		wage = new JTextField();
		horizontalBox_6.add(wage);
		wage.setColumns(10);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		horizontalBox_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_7);
		
		JLabel lblYear = new JLabel("Minimum Year");
		horizontalBox_7.add(lblYear);
		
		minYear = new JTextField();
		horizontalBox_7.add(minYear);
		minYear.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(1.0f);
		verticalBox.add(horizontalBox);
		
		JLabel lblPosition = new JLabel("Position");
		horizontalBox.add(lblPosition);

		CheckboxGroup positionGroup = new CheckboxGroup();
		JCheckBox position_office = new JCheckBox("Office Work", positionGroup, );
		horizontalBox.add(position);

		JCheckBox position_research = new JCheckBox("Research");
		horizontalBox.add(position);

		JCheckBox position_translate = new JCheckBox("Translate");
		horizontalBox.add(position);

		JCheckBox position_design = new JCheckBox("Design");
		horizontalBox.add(position);

		JCheckBox position_programming = new JCheckBox("Programming");
		horizontalBox.add(position);

		JCheckBox position_manage = new JCheckBox("Manage");
		horizontalBox.add(position);

		JCheckBox position_etc = new JCheckBox("etc");
		horizontalBox.add(position);

		JCheckBox position_admin = new JCheckBox("Administrate");
		horizontalBox.add(position);
		//행정 연구 관리 디자인 번역 개발 사무 기타
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		horizontalBox_9.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_9);
		
		JLabel lblMinimumGpa = new JLabel("Minimum GPA");
		horizontalBox_9.add(lblMinimumGpa);
		
		minGPA = new JTextField();
		horizontalBox_9.add(minGPA);
		minGPA.setColumns(10);
		
		Box horizontalBox_10 = Box.createHorizontalBox();
		horizontalBox_10.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_10);
		
		JLabel lblMajorCondition = new JLabel("Major condition");
		horizontalBox_10.add(lblMajorCondition);
		
		majorCondition = new JTextField();
		horizontalBox_10.add(majorCondition);
		majorCondition.setColumns(10);
		
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
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnHigh);
		group.add(rdbtnMideum);
		group.add(rdbtnLow);
		
		Box horizontalBox_11 = Box.createHorizontalBox();
		horizontalBox_11.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_11);
		
		JLabel lblExtraRequirement = new JLabel("ExtraRequirement");
		horizontalBox_11.add(lblExtraRequirement);
		
		extraRequirement = new JTextField();
		horizontalBox_11.add(extraRequirement);
		extraRequirement.setColumns(10);
		
		
		Box horizontalBox_button = Box.createHorizontalBox();
		horizontalBox_button.setAlignmentX(Component.RIGHT_ALIGNMENT);
		verticalBox.add(horizontalBox_button);
		
		JButton btnNewButton = new JButton("완료");
		horizontalBox_button.add(btnNewButton);
		
		ActionListener finListener = new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				try {
					
					ProgramInformation newInternship = new ProgramInformation();
					
					//newInternship.setProgramID(programID);
					newInternship.setProgramName(programName.getText());
					newInternship.setCompanyName(companyName.getText());
					newInternship.setWorkingCountry(workingCountry.getText());
					
					Date DclosingDate = null;
					try {
						DclosingDate = new SimpleDateFormat("yyyy-MM-dd").parse(closingDate.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					newInternship.setClosingDate(DclosingDate);
					
					Date DstartDate = null;
					Date DendDate = null;
					try{
						DstartDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate.getText());
						DendDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDate.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Period Dperiod = new Period();
					Dperiod.startDate = DstartDate;
					Dperiod.endDate = DendDate;
					newInternship.setWorkingPeriod(Dperiod);
					
					newInternship.setWage(Integer.parseInt(wage.getText()));
					newInternship.getProgramRequirement().setMinYear(Integer.parseInt(minYear.getText()));

					newInternship.setPosition(position.getText());
					position.getp
					newInternship.getProgramRequirement().setMinGpa(Float.parseFloat(minGPA.getText()));

					newInternship.getProgramRequirement().setMajorCondition(majorCondition.getText());
					
					int englishLevel = 0;
					if(rdbtnHigh.isSelected()) {
						newInternship.getProgramRequirement().setEnglishLevel(3);
						englishLevel = Integer.parseInt(rdbtnHigh.getText());
					}
					else if(rdbtnMideum.isSelected()) {
						newInternship.getProgramRequirement().setEnglishLevel(2);
						englishLevel = Integer.parseInt(rdbtnMideum.getText());
					}
					else {
						newInternship.getProgramRequirement().setEnglishLevel(1);
						englishLevel = Integer.parseInt(rdbtnLow.getText());
					}

					//newInternship.setExtraRequirement();
					
					InternshipProgram internshipProgram = new InternshipProgram(); // 이거 메인에 넣기
					internshipProgram.makeInternshipProgram(newInternship);
					
					File file = new File("internship.txt");
					FileWriter writer = null;
					writer = new FileWriter(file, true);
					writer.write(programName.getText() + "|" + companyName.getText() + "|"
					+ workingCountry.getText() + "|" + closingDate.getText() + "|" + startDate.getText() + "|"
					+ endDate.getText() + "|" + wage.getText() + "|" + minYear.getText() + "|" + position.getText() + "|" 
					+ minGPA.getText() + "|" + majorCondition.getText() + "|" + englishLevel + "\r\n");
					writer.flush();
					dispose();
					
					GuiInternshipShow internshipShow = new GuiInternshipShow();
					internshipShow.intershipShowShow.run();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};

		btnNewButton.addActionListener(finListener);
		
		JButton button = new JButton("취소");
		horizontalBox_button.add(button);
		ActionListener canListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		};
		button.addActionListener(canListener);
	}

}
