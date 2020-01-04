package com.del.webapp.dao;
import java.sql.*;
import java.util.ArrayList;
import com.del.webapp.entity.Courses;
public class CoursesDAO 
{
	public boolean insertCourses(Courses cour)
	{
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("insert into courses values(?,?,?,?)");
			pst.setInt(1, cour.getCourse_id());
			pst.setString(2, cour.getCourse_name());
			pst.setDouble(3, cour.getCourse_duration());
			pst.setDouble(4, cour.getCourse_fee());
			count = pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count ==1;
	}
	public boolean modifyCourses(Courses cour)
	{
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("update courses set course_name=?,course_duration=?,course_fee=? where course_id=?");
			pst.setString(1, cour.getCourse_name());
			pst.setDouble(2, cour.getCourse_duration());
			pst.setDouble(3, cour.getCourse_fee());
			pst.setInt(4, cour.getCourse_id());
			count = pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count ==1;
	}
	public boolean removeCourses(int course_id)
	{
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("delete from courses where course_id=?");
			pst.setInt(1, course_id);
			count = pst.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count ==1;
	}
	public Courses getCourses(int course_id)
	{
		Courses cour = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("select * from courses where course_id=?");
			pst.setInt(1, course_id);
			rs = pst.executeQuery();
			if(rs.next())
				cour = new Courses(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null) rs.close();
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return cour;
	}
	public ArrayList<Courses> getCourses()
	{
		ArrayList<Courses> clist = new ArrayList<Courses>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("select * from courses");
			rs = pst.executeQuery();
			while(rs.next())
				clist.add(new Courses(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4)));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(pst!=null) pst.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return clist;
	}
}
