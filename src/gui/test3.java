package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class test3 extends JFrame {

	private JPanel contentPane;
	
	
	public class show extends Thread {
		public void run() {
			test3 frame = new test3();
			frame.setVisible(true);
		}
	}
	
	show d = new show();
	
	public void print_null() {
		System.out.println("NNNNNNNN");
	}

	/**
	 * Create the frame.
	 */
	public test3() {
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
		
		JLabel label = new JLabel("등록된 인턴 프로그램이 없습니다.");
		panel_2.add(label);
	}

}
