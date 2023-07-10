package electricitybill;
import java.sql.*;


public class conn {
    Connection c; 
    Statement s;
	conn(){ 
		try {
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electbill","root","Rujal@R22S");
       s=c.createStatement();
    } 
		catch(Exception e) {
			e.printStackTrace();
		}
	}}
