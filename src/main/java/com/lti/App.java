package com.lti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public App(){
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:oracle", "System", "Anu4312$");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void getAccountDetails(){
		try {
			rs = st.executeQuery("Select * From hr.Student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
