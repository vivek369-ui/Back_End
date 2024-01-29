import java.sql.*;
class JDBC
{
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try
		{
			// load the driver:
			Class.forName("com.mysql.jdbc.Driver");

			// Creating a connection

			String url="jdbc:mysql://localhost:/";
			String username="root";
			String password="";

			con=DriverManager.getConnection(url,username,password);

			
			System.out.println("Connection is Created.....!");
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
1)  Load the driver

	Class.forName("com.mysql.cj.jdbc.Driver")//driver for mysql
	// Class.forName("org.postgresql.Driver");

2)Create a Connection:

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:3600/postgres","root","root");

3)Create query, Statement, PreparedStatement, CallableStatement
eg 
 	String q="select * from student";

 	Statement stmt=con.createStatement();

 	ResultSet set=stmt.ExecuteQuery(q);

4)Process the data :
	
	while (set.next())
	{
		int id=set.getInt("studentId");
		String name=set.getString("studentName");
	}