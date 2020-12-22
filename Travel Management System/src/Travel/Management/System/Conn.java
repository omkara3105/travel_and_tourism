package Travel.Management.System;
import java.sql.*;
public class Conn {
	public Connection c;
	public Statement s;
	public Conn(){
    try
    {
    	Class.forName("com.mysql.jdbc.Driver");
    	c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","3105");
    	s = c.createStatement();
    }catch(Exception e){
    	
    }
  }
}
