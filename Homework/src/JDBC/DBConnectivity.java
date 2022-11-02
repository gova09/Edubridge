package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectivity {
	private static final String CREATE_TABLE="CREATE TABLE User("+"USER_ID int(10) NOT NULL,"+"FULLNAME VARCHAR(20) NOT NULL)";
	
	public static void main(String[] args)throws ClassNotFoundException
	{
		String url="jdbc:mysq://localhost:3306/";
		String username="root";
		String passwrd="Govarthana@09";
		Connection connect=null;
		PreparedStatement statement =null;
		Class.forName("com.sql.cj.jdbc.Driver");
		try
		{
			connect=DriverManager.getConnection(url,username,passwrd);
			statement=connect.preparedStatement(CREATE_TABLE);
			statement.executeUpdate();
			System.out.println("Table created");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(statemnt !=null)
				{
					statement.close();
				}
				if(connection !=null)
				{
					connect.close();
				}
				
			}
			
		}
	}
	
	


