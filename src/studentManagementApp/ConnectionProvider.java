package studentManagementApp;
import java.sql.*;
// this class is responsible to create a connection to the my sql database
public class ConnectionProvider 
{
	public static Connection connection;
	//create connection method establish a connection by using ,url,localhost they use
	public static Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		try
		{
			connection= DriverManager.getConnection(url);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;// return the connection object
	}
}




