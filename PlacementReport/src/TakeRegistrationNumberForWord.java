import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TakeRegistrationNumberForWord
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
					TakeRegistrationNumberForWord window = new TakeRegistrationNumberForWord();
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
	public TakeRegistrationNumberForWord()
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
		frame.getContentPane().setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterRegistrationNumber = new JLabel("Enter Registration Number");
		lblEnterRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEnterRegistrationNumber.setBounds(125, 45, 206, 19);
		frame.getContentPane().add(lblEnterRegistrationNumber);
		
		textField = new JTextField();
		textField.setBounds(179, 90, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGenerateWord = new JButton("Generate Word File\r\n");
		btnGenerateWord.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnGenerateWord.setBounds(125, 140, 206, 23);
		frame.getContentPane().add(btnGenerateWord);
		
		btnGenerateWord.addActionListener(new ActionListener()
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
					
					GenerateWordFile.main(data);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Student does not exists");
					textField.setText("");
				}
				frame.dispose();
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(179, 185, 89, 23);
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