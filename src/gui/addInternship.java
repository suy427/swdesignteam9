package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class addInternship extends JFrame {

	private JPanel contentPane;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addInternship frame = new addInternship();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addInternship() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_top = new JPanel();
		contentPane.add(panel_top, BorderLayout.NORTH);
		
		JLabel label = new JLabel("인턴 프로그램 정보 관리");
		panel_top.add(label);
		
		JPanel panel_center = new JPanel();
		contentPane.add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 510, 503);
		panel_center.add(panel_6);
		panel_6.setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(0, 0, 510, 232);
		verticalBox.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel_6.add(verticalBox);
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_8);
		
		JLabel lblProgramname_1 = new JLabel(" ProgramName");
		horizontalBox_8.add(lblProgramname_1);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setColumns(10);
		horizontalBox_8.add(textField_7);
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_9);
		
		JLabel lblProgramname = new JLabel(" CompanyName");
		horizontalBox_9.add(lblProgramname);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_8.setColumns(10);
		horizontalBox_9.add(textField_8);
		
		Box horizontalBox_10 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_10);
		
		JLabel lblWorkingCountry = new JLabel(" Working country");
		horizontalBox_10.add(lblWorkingCountry);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setColumns(10);
		horizontalBox_10.add(textField_9);
		
		Box horizontalBox_13 = Box.createHorizontalBox();
		horizontalBox_10.add(horizontalBox_13);
		
		JLabel lblPosition = new JLabel(" Position");
		horizontalBox_13.add(lblPosition);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_11.setColumns(10);
		horizontalBox_13.add(textField_11);
		
		Box horizontalBox_11 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_11);
		
		JLabel lblClosingDate = new JLabel(" Closing Date");
		horizontalBox_11.add(lblClosingDate);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_10.setColumns(10);
		horizontalBox_11.add(textField_10);
		
		Box horizontalBox_15 = Box.createHorizontalBox();
		horizontalBox_11.add(horizontalBox_15);
		
		JLabel lblYear = new JLabel(" Working Term ");
		horizontalBox_15.add(lblYear);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setColumns(10);
		horizontalBox_15.add(textField_13);
		
		Box horizontalBox_14 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_14);
		
		JLabel lblWage = new JLabel(" Wage ");
		horizontalBox_14.add(lblWage);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setColumns(10);
		horizontalBox_14.add(textField_12);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel lblWorkingTerm = new JLabel("Year");
		horizontalBox.add(lblWorkingTerm);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		horizontalBox.add(textField);
		
		Box horizontalBox_12 = Box.createHorizontalBox();
		horizontalBox.add(horizontalBox_12);
		
		JLabel lblEnglishLevel = new JLabel(" English Level");
		horizontalBox_12.add(lblEnglishLevel);
		
		JCheckBox checkBox_3 = new JCheckBox("상");
		horizontalBox_12.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("중");
		horizontalBox_12.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("하");
		horizontalBox_12.add(checkBox_5);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JLabel label_1 = new JLabel(" Wage ");
		horizontalBox_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		horizontalBox_1.add(textField_1);
		
		JPanel panel_bottom = new JPanel();
		contentPane.add(panel_bottom, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("삭제");
		panel_bottom.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("수정");
		panel_bottom.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("추가");
		panel_bottom.add(btnNewButton_1);
	}

}
