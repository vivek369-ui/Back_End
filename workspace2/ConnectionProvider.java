

import java.sql.*;
public class ConnectionProvider  {
		private static Connection con;
		public static Connection getConnection() {
		
			try 
			{
			if(con == null)
			{
				
				// load the driver:
				Class.forName("org.postgresql.Driver");

				// Creating a connection
				con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:3600/postgres", "root", "root");
				
				System.out.println("connected...");
				
			}
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
			
			
			return con;

		
		}
}
