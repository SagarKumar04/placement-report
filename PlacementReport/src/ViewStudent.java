import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

public class ViewStudent extends JFrame
{
	static ViewStudent frame;
	
	public ViewStudent()
	{
		List<String[]> studentDetail = StudentDAO.viewAllStudentsData();
		int size = studentDetail.size();
		
		String studentData[][] = new String[size][9];
		int row = 0;
		
		for(String rowDetail[]: studentDetail)
		{
			studentData[row][0] = rowDetail[0];
			studentData[row][1] = rowDetail[1];
			studentData[row][2] = rowDetail[2];
			studentData[row][3] = rowDetail[3];
			studentData[row][4] = rowDetail[4];
			studentData[row][5] = rowDetail[5];
			studentData[row][6] = rowDetail[6];
			studentData[row][7] = rowDetail[7];
			studentData[row][8] = rowDetail[8];
			
			row++;
		}
		
		String columnNames[] = {"Registration Number", "Student Name", "Branch", "Year", "Semester", "Company", "Start Date", "End Date", "Duration"};
		
		JTable jt = new JTable(studentData, columnNames);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		
		TableColumn column = null;
		column = jt.getColumnModel().getColumn(0);
		column.setPreferredWidth(150);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 400);
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try
				{
					frame = new ViewStudent();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
	}
}