package com.sqlserver.connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class JavaConnect {
	public static void main(String[] args) {
		try
		{
			String url="jdbc:sqlserver://ABEYMICHAEL\\SQLEXPRESS;databaseName=Student";
			String username="mariamolgeorge";
			String Password="maria123";
			Connection con=DriverManager.getConnection(url, username, Password);
			Statement st=con.createStatement();
			
			String sql = "insert into  Student_Details values(\"maria\",121)";
			st.execute(sql);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
