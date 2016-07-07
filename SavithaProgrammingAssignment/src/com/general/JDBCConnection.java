package com.general;

	import java.sql.*;
	import java.sql.*;  
	class JDBCConnection{  
	public static void main(String args[]){  
	try{  
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	//step2 create  the connection object  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
	  
	//step3 create the statement object  
	Statement stmt=con.createStatement();  
	  
	//step4 execute query  
	ResultSet rs=stmt.executeQuery("select * from employees");  
	//while(rs.next())  
//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	  
	
	//Insert records
	
	 PreparedStatement pstmt1 = con.prepareStatement("insert into regions (REGION_ID,REGION_NAME) values('5','Australia')");
	 pstmt1.executeUpdate();
	
		System.out.println("inserted record");
		//update records

	 PreparedStatement pstmt2 = con.prepareStatement("UPDATE regions SET region_id = 6 WHERE region_name = 'Australia'");
			 
		
		
		//step5 close the connection object  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  