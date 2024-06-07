package Sample;

import java.sql.*;

public class AAiTSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
	
			String url = "jdbc:mysql://localhost:3306/studentsDB";
		
			String username = "root"; //your username
		
			String password = "root"; //your password
		
			Class.forName(driver); //optional
		
			Connection conn = DriverManager.getConnection(url,
		
					username, password);
		
			System.out.println("Established Connection");
	
		}catch (Exception e) {
		
			e.printStackTrace();// TODO: handle exception
		
		}
		
	}
	
}


