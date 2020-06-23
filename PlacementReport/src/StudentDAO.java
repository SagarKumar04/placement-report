import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAO
{
	public static Connection getCon()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","","");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		return con;
	}
	
	public static int addStudent(String regd, String name, String branch, String year, String semester, String company, String start, String end, String duration)
	{
		int status = 0;
		
		try
		{
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("insert into placement_students (regd, name, branch, year, semester, company, start, end, duration) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, regd);
			ps.setString(2, name);
			ps.setString(3, branch);
			ps.setString(4, year);
			ps.setString(5, semester);
			ps.setString(6, company);
			ps.setString(7, start);
			ps.setString(8, end);
			ps.setString(9, duration);
			
			status = ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		return status;
	}
	
	public static String[] getStudentDataByRegistrationNumber(String regd)
	{
		String s[] = new String[8];
		
		try
		{
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("select * from placement_students where regd = ?");
			ps.setString(1, regd);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				s[0] = rs.getString("name");
				s[1] = rs.getString("branch");
				s[2] = rs.getString("year");
				s[3] = rs.getString("semester");
				s[4] = rs.getString("company");
				s[5] = rs.getString("start");
				s[6] = rs.getString("end");
				s[7] = rs.getString("duration");
			}
			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		return s;
	}
	
	public static int update(String s[])
	{
		int status = 0;
		
		try
		{
			Connection con = getCon();
			
			PreparedStatement ps = con.prepareStatement("update placement_students set regd = ?, name = ?, branch = ?, year = ?, semester = ?, company = ?, start = ?, end = ?, duration = ? where regd = ?");
			ps.setString(1, s[0]);
			ps.setString(2, s[1]);
			ps.setString(3, s[2]);
			ps.setString(4, s[3]);
			ps.setString(5, s[4]);
			ps.setString(6, s[5]);
			ps.setString(7, s[6]);
			ps.setString(8, s[7]);
			ps.setString(9, s[8]);
			ps.setString(10, s[0]);
			
			status = ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		return status;
	}
	
	public static int delete(String regd)
	{
		int status = 0;
		
		try
		{
			Connection con = getCon();
			
			PreparedStatement ps = con.prepareStatement("delete from placement_students where regd = ?");
			ps.setString(1, regd);
			
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		return status;
	}
	
	public static int checkIfStudentExists(String regd)
	{	
		int status = 0;
		
		try
		{
			Connection con = getCon();
			
			PreparedStatement ps = con.prepareStatement("select * from placement_students where regd = ?");
			ps.setString(1, regd);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				status = status + 1;
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		
		return status;
	}
	
	public static List<String[]> viewAllStudentsData()
	{
		List <String[]> studentDetail = new ArrayList<String[]>();
		try
		{	
			
			Connection con = getCon();
			PreparedStatement ps = con.prepareStatement("select * from placement_students");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String rows[] = new String[9];
				
				rows[0] = rs.getString("regd");
				rows[1] = rs.getString("name");
				rows[2] = rs.getString("branch");
				rows[3] = rs.getString("year");
				rows[4] = rs.getString("semester");
				rows[5] = rs.getString("company");
				rows[6] = rs.getString("start");
				rows[7] = rs.getString("end");
				rows[8] = rs.getString("duration");
				
				studentDetail.add(rows);
			}
			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
		return studentDetail;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}