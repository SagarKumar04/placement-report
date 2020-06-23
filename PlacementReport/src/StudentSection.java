import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentSection
{
	private JFrame frame;

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
					StudentSection window = new StudentSection();
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
	public StudentSection()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setTitle("Student Section");
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddStudent = new JButton("Add Student Details");
		btnAddStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnAddStudent.setBounds(126, 23, 211, 23);
		frame.getContentPane().add(btnAddStudent);
		
		btnAddStudent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				AddStudent.main(new String[] {});
				frame.dispose();
			}
		});
		
		JButton btnEditStudent = new JButton("Edit Student Details");
		btnEditStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnEditStudent.setBounds(126, 77, 211, 23);
		frame.getContentPane().add(btnEditStudent);
		
		btnEditStudent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				TakeRegistrationNumber.main(new String [] {});
				frame.dispose();
			}
		});
		
		JButton btnDeleteStudent = new JButton("Delete Student Details");
		btnDeleteStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnDeleteStudent.setBounds(126, 130, 211, 23);
		frame.getContentPane().add(btnDeleteStudent);
		
		btnDeleteStudent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				DeleteStudent.main(new String[] {});
			}
		});
		
		JButton btnGetStudentDetails = new JButton("View Student Details");
		btnGetStudentDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGetStudentDetails.setBounds(126, 181, 211, 23);
		frame.getContentPane().add(btnGetStudentDetails);
		
		btnGetStudentDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				ViewStudent.main(new String[] {});
			}
		});
		
		JButton btnGenerateWordFile = new JButton("Generate Word File");
		btnGenerateWordFile.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGenerateWordFile.setBounds(126, 233, 211, 23);
		frame.getContentPane().add(btnGenerateWordFile);
		
		btnGenerateWordFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				TakeRegistrationNumberForWord.main(new String[] {});
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLogout.setBounds(180, 284, 89, 23);
		frame.getContentPane().add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				LoginPage.main(new String[] {});
				frame.dispose();
			}
		});
	}
}