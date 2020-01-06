import java.sql.*;
public class DBTest
{
	public static void main(String[] args) throws Exception 
	{
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		try
		{
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con=DriverManager.getConnection(url,"scott","tiger");
		   st = con.prepareCall("call insertmaster(?,?,?)");
		   st.setInt(1, 110);
		   st.setString(2,"Ajay");
		   st.setDouble(3, 123456.78);
		   st.executeUpdate();
     	 }
	    catch(Exception e)
	    {
		  e.printStackTrace();
	    }
	    finally
	    {
	 	  try
		  {
	 		if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(con!=null) con.close();
		  }
		  catch(Exception ex)
		  {
			ex.printStackTrace();
		  }
	    }
	}
}
