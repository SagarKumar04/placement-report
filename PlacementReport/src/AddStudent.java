import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AddStudent
{
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					AddStudent window = new AddStudent();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setTitle("Add Student Details");
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddStudentDetails = new JLabel("Add Student Details");
		lblAddStudentDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblAddStudentDetails.setBounds(146, 11, 158, 19);
		frame.getContentPane().add(lblAddStudentDetails);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblRegistrationNumber.setBounds(26, 57, 158, 21);
		frame.getContentPane().add(lblRegistrationNumber);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblName.setBounds(24, 102, 71, 19);
		frame.getContentPane().add(lblName);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblBranch.setBounds(24, 144, 71, 19);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblYear.setBounds(24, 184, 71, 19);
		frame.getContentPane().add(lblYear);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblSemester.setBounds(26, 221, 82, 21);
		frame.getContentPane().add(lblSemester);
		
		JLabel lblStartDateOf = new JLabel("Internship Start Date\r\n");
		lblStartDateOf.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblStartDateOf.setBounds(26, 306, 158, 19);
		frame.getContentPane().add(lblStartDateOf);
		
		JLabel lblEndDateOf = new JLabel("Internship End Date");
		lblEndDateOf.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEndDateOf.setBounds(26, 350, 147, 21);
		frame.getContentPane().add(lblEndDateOf);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDuration.setBounds(26, 443, 82, 21);
		frame.getContentPane().add(lblDuration);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblCompanyName.setBounds(25, 263, 122, 19);
		frame.getContentPane().add(lblCompanyName);
		
		textField = new JTextField();
		textField.setBounds(218, 59, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 101, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 143, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(218, 185, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(218, 223, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(218, 264, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(218, 307, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(218, 352, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(218, 445, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnSubmit.setBounds(75, 488, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCalculateDuration = new JButton("Calculate Duration");
		btnCalculateDuration.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnCalculateDuration.setBounds(75, 397, 169, 23);
		frame.getContentPane().add(btnCalculateDuration);
		
		JLabel lbDdmmyyyy = new JLabel("(dd/mm/yyyy)");
		lbDdmmyyyy.setBounds(324, 310, 100, 19);
		frame.getContentPane().add(lbDdmmyyyy);
		
		JLabel lblddmmyyyy = new JLabel("(dd/mm/yyyy)");
		lblddmmyyyy.setBounds(324, 355, 76, 16);
		frame.getContentPane().add(lblddmmyyyy);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(246, 488, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblDays = new JLabel("days");
		lblDays.setBounds(324, 448, 46, 14);
		frame.getContentPane().add(lblDays);
		
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentSection.main(new String[] {});
				frame.dispose();
			}
		});
		
		btnCalculateDuration.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent arg0)
			{
				String sStartDate = textField_6.getText();
				String sEndDate = textField_7.getText();
				try
				{
					Date sDate;
					Date eDate;
					sDate = new SimpleDateFormat("dd/MM/yyyy").parse(sStartDate);
					eDate = new SimpleDateFormat("dd/MM/yyyy").parse(sEndDate);
					
					long diff = eDate.getTime() - sDate.getTime();
					
					long diffInDays = TimeUnit.MILLISECONDS.toDays(diff);
					
					String sDiffInDays = String.valueOf(diffInDays);
					
					textField_8.setText(sDiffInDays);		
				}
				catch (ParseException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int status;
				
				String regd = textField.getText();
				String name = textField_1.getText();
				String branch = textField_2.getText();
				String year = textField_3.getText();
				String semester = textField_4.getText();
				String company = textField_5.getText();
				String start = textField_6.getText();
				String end = textField_7.getText();
				String duration = textField_8.getText();
				
				status = StudentDAO.addStudent(regd, name, branch, year, semester, company, start, end, duration);
				
				if(status > 0)
				{
					JOptionPane.showMessageDialog(null, "Student added successfully");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Failed to add student");
				}
			}
		});
	}
}