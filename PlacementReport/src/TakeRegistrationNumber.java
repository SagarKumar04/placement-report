import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TakeRegistrationNumber
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
					TakeRegistrationNumber window = new TakeRegistrationNumber();
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
	public TakeRegistrationNumber()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setTitle("Registration Number");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterRegistrationNumber = new JLabel("Enter Registration Number");
		lblEnterRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEnterRegistrationNumber.setBounds(126, 43, 199, 20);
		frame.getContentPane().add(lblEnterRegistrationNumber);
		
		textField = new JTextField();
		textField.setBounds(155, 89, 134, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGetDetails = new JButton("Get Details");
		btnGetDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGetDetails.setBounds(145, 140, 157, 23);
		frame.getContentPane().add(btnGetDetails);
		
		btnGetDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	
				String regd = textField.getText();
				String sqlData[] = new String[8];
				
				int status;
				
				status = StudentDAO.checkIfStudentExists(regd);
				if(status > 0)
				{
					sqlData = StudentDAO.getStudentDataByRegistrationNumber(regd);
					
					String data[] = new String[9];
					data[0] = textField.getText();
					
					for(int i = 1; i < 9; i++)
					{
						data[i] = sqlData[i - 1];
					}
					EditStudent.main(data);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student does not exists");
					textField.setText("");
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(180, 192, 89, 23);
		frame.getContentPane().add(btnBack);
		
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