package daocontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.Emp;



public class DaoLoginController {

	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase", "root", "root");
		
		 System.out.println();
		 return con;
	}
	
	
	//********************Login method**********************************//
	public static boolean logindata(String name , String password) throws ClassNotFoundException, SQLException{
		boolean sttus = false;
		Emp e = new Emp();
		// System.out.println(e.getName());
		 String n = e.getName();
		 String p = e.getPassword();
		 System.out.println("this is nnnnnnnnnnnnnnnnnnn"+n);
		System.out.println("this is pppppppppppppppppppp"+p);
		Connection con=DaoLoginController.getConnection();
	    PreparedStatement ps= con.prepareStatement("SELECT name ,password FROM user995 WHERE NAME = ? AND PASSWORD = ? " ,PreparedStatement.RETURN_GENERATED_KEYS );
	    ps.setString(1,name);  
	    ps.setString(2,password);  
	    ResultSet rs=ps.executeQuery();  
	    sttus=rs.next();
	    con.close();
	    return sttus;
	    
	}
}
