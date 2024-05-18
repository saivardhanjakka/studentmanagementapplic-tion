package studentManagementApp;
import java.sql.*;
//This class contains methods for performing various database operations related to student records.

public class DataBaseOperations 
{
	public static boolean  insertIntoDB(Student s)//he insertIntoDB(Student s) method inserts a Student object into the database.
	
	{
		boolean flag = false;
		try
		{
			//It retrieves a database connection using the ConnectionProvider.createConnection() method.
			Connection conn = ConnectionProvider.createConnection();
			// SQL query to insert the student's name, branch, and address into the table studentmanagement.students.
			String query = "insert into studentmanagement.students(name,branch,address) values(?,?,?)";
			//Uses a PreparedStatement to set the parameter values in the query and executes the query using executeUpdate().
			PreparedStatement pstmnt = conn.prepareStatement(query);
			pstmnt.setString(1, s.getName());
			pstmnt.setString(2, s.getBranch());
			pstmnt.setString(3, s.getAddress());
			//execute query
			int updated = pstmnt.executeUpdate();
			//If any rows are affected (updated>0), it sets the flag variable to true.
			//after that it  closes the connection and returns the flag value indicating the success or failure of the operation.

			if(updated>0)
			{
				flag=true;
			}
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	// The display() method retrieves and displays all student records from the studentmanagement.students table.
	public static void display()
	{
		try 
		{
			Connection conn = ConnectionProvider.createConnection();
			Statement stmnt = conn.createStatement();
			String query = "select * from studentmanagement.students";
			ResultSet rs=stmnt.executeQuery(query);
			while(rs.next())
			{
				int rollNo = rs.getInt(1);
				String name = rs.getString(2);
				String branch = rs.getString(3);
				String address = rs.getString(4);
				System.out.println("RollNo: "+rollNo);
				System.out.println("Name: "+name);
				System.out.println("Branch: "+branch);
				System.out.println("Address: "+address);
				System.out.println("__________________________________________________");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//The deleteStudent(int rollNo) method deletes a student record from the database based on the provided roll number.
	public static boolean deleteStudent(int rollNo)
	{
		boolean flag = false;
		try
		{
			Connection conn = ConnectionProvider.createConnection();
			String query = "delete from studentmanagement.students where rollNo=?";
			PreparedStatement pstmnt = conn.prepareStatement(query);
			pstmnt.setInt(1, rollNo);
			//execute query
			int updated = pstmnt.executeUpdate();
			if(updated>0)
			{
				flag=true;
			}
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}


}
