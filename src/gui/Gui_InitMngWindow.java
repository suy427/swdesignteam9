package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;

public class Gui_InitMngWindow extends JFrame {
	
	private int programId = 0;
	private JPanel contentPane;
	private GuiInternshipAdd internshipAdd = new GuiInternshipAdd();
	
	public class show extends Thread {
		public void run() {
			Gui_InitMngWindow frame = new Gui_InitMngWindow();
			frame.setVisible(true);
		}
	}
	
	show intershipNullShow = new show();

	public Gui_InitMngWindow() {
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
		
		JPanel panel_2 = new JPanel();
		verticalBox_1.add(panel_2);
		
		JLabel label = new JLabel("등록된 인턴 프로그램이 없습니다.");
		panel_2.add(label);
		
		JButton btn_addProgram = new JButton("인턴프로그램 추가");

		btn_addProgram.setAlignmentY(Component.TOP_ALIGNMENT);
		verticalBox_1.add(btn_addProgram);
		btn_addProgram.setHorizontalAlignment(SwingConstants.RIGHT);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				internshipAdd.setAddProgramID(programId);
				
				internshipAdd.internshipAddShow.run();
//				programId++;
			}
		};
		btn_addProgram.addActionListener(listener);
	}
}
