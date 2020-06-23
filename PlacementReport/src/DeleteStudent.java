import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteStudent
{

	private JFrame frame;
	private JTextField textField;

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
					DeleteStudent window = new DeleteStudent();
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
	public DeleteStudent()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setTitle("Delete Student Details");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterRegistrationNumber = new JLabel("Enter Registration Number");
		lblEnterRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEnterRegistrationNumber.setBounds(121, 87, 202, 19);
		frame.getContentPane().add(lblEnterRegistrationNumber);
		
		textField = new JTextField();
		textField.setBounds(147, 133, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnDelete.setBounds(59, 180, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int status;
				
				String regd = textField.getText();
				status = StudentDAO.delete(regd);
				
				if(status > 0)
				{
					JOptionPane.showMessageDialog(null, "Deletion successful");
					textField.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Deletion unsuccessful");
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(293, 180, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblDeleteStudentDetails = new JLabel("Delete Student Details");
		lblDeleteStudentDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDeleteStudentDetails.setBounds(132, 26, 176, 19);
		frame.getContentPane().add(lblDeleteStudentDetails);
		
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentSection.main(new String[] {});
				frame.dispose();
			}
		});
	}
}