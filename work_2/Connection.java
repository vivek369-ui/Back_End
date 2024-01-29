package Sample;

import java.sql.*;
class DB_connection
{
	public static void main(String[] args) throws Exception
	{
	Connection con = null;
		try
		{
			// load the driver:
			Class.forName("com.mysql.jdbc.Driver");

			// Creating a connection

			String url="jdbc:mysql://localhost:3306/sample";
			String username="root";
			String password="";

			 con=DriverManager.getConnection(url,username,password);

			
			System.out.println("Connected.....!");
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}	

	