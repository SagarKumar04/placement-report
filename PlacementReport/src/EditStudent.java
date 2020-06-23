import java.awt.EventQueue;

import javax.swing.*;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EditStudent
{
	static String imageName;
	static String regd;
	static String name;
	static String branch;
	static String year;
	static String semester;
	static String company;
	static String start;
	static String end;
	static String duration;
	
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
		imageName = args[0];
		regd = args[0];
		name = args[1];
		branch = args[2];
		year = args[3];
		semester = args[4];
		company = args[5];
		start = args[6];
		end = args[7];
		duration = args[8];
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					EditStudent window = new EditStudent();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditStudent()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setTitle("Edit Student Details");
		frame.setBounds(100, 100, 550, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblRegistrationNumber.setBounds(42, 85, 157, 26);
		frame.getContentPane().add(lblRegistrationNumber);
		
		textField = new JTextField();
		textField.setBounds(221, 90, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblName.setBounds(42, 146, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblBranch.setBounds(42, 185, 74, 20);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblYear.setBounds(42, 225, 46, 20);
		frame.getContentPane().add(lblYear);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblSemester.setBounds(42, 265, 74, 20);
		frame.getContentPane().add(lblSemester);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 143, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 182, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 222, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 265, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblCompanyName.setBounds(42, 310, 120, 20);
		frame.getContentPane().add(lblCompanyName);
		
		JLabel lblInternshipStartDate = new JLabel("Internship Start Date");
		lblInternshipStartDate.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblInternshipStartDate.setBounds(42, 355, 166, 20);
		frame.getContentPane().add(lblInternshipStartDate);
		
		JLabel lblInternshipEndDate = new JLabel("Internship End Date");
		lblInternshipEndDate.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblInternshipEndDate.setBounds(42, 404, 147, 20);
		frame.getContentPane().add(lblInternshipEndDate);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDuration.setBounds(42, 527, 74, 20);
		frame.getContentPane().add(lblDuration);
		
		textField_5 = new JTextField();
		textField_5.setBounds(221, 312, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(221, 357, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(221, 406, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(221, 529, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(365, 96, 125, 125);
		frame.getContentPane().add(panel);
		JLabel label = new JLabel();
		String imagePath = "C:\\Users\\Sagar\\Desktop\\" + imageName + ".JPEG";
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT));
		label.setIcon(imageIcon);
		panel.add(label);
		
		textField.setText(regd);
		textField_1.setText(name);
		textField_2.setText(branch);
		textField_3.setText(year);
		textField_4.setText(semester);
		textField_5.setText(company);
		textField_6.setText(start);
		textField_7.setText(end);
		textField_8.setText(duration);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(286, 596, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblddmmyyyy = new JLabel("(dd/mm/yyyy)");
		lblddmmyyyy.setBounds(349, 360, 80, 20);
		frame.getContentPane().add(lblddmmyyyy);
		
		JLabel lblddmmyyyy_1 = new JLabel("(dd/mm/yyyy)");
		lblddmmyyyy_1.setBounds(349, 409, 80, 20);
		frame.getContentPane().add(lblddmmyyyy_1);
		
		JButton btnCalculateDuration = new JButton("Calculate Duration");
		btnCalculateDuration.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnCalculateDuration.setBounds(115, 476, 173, 26);
		frame.getContentPane().add(btnCalculateDuration);
		
		JLabel lblEditStudentDetails = new JLabel("Edit Student Details");
		lblEditStudentDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEditStudentDetails.setBounds(190, 30, 157, 20);
		frame.getContentPane().add(lblEditStudentDetails);
		
		btnCalculateDuration.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent arg0)
			{
				String sStartDate = textField_6.getText();
				String sEndDate = textField_7.getText();
				String initialDate = "00/00/0000";
				
				try
				{
					Date sDate;
					Date eDate;
					Date duration;
					
					sDate = new SimpleDateFormat("dd/MM/yyyy").parse(sStartDate);
					eDate = new SimpleDateFormat("dd/MM/yyyy").parse(sEndDate);
					
					long diff = eDate.getTime() - sDate.getTime();
					
					long diffInDays = TimeUnit.MILLISECONDS.toDays(diff);
					
					String sDiffInDays = String.valueOf(diffInDays);
					
					textField_8.setText(sDiffInDays);		
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnSubmit.setBounds(138, 596, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String getData[] = new String[9];
				int status;
				
				getData[0] = textField.getText();
				getData[1] = textField_1.getText();
				getData[2] = textField_2.getText();
				getData[3] = textField_3.getText();
				getData[4] = textField_4.getText();
				getData[5] = textField_5.getText();
				getData[6] = textField_6.getText();
				getData[7] = textField_7.getText();
				getData[8] = textField_8.getText();
				
				status = StudentDAO.update(getData);
				
				if(status > 0)
				{
					JOptionPane.showMessageDialog(null, "Student data edited successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Failed to edit student data");
				}
			}
		});
		
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				TakeRegistrationNumber.main(new String[] {});
				frame.dispose();
			}
		});
		
	}
}