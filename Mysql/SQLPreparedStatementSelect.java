package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementSelect {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college?characterEncoding=latin1","root","Vbmvbm@2223");

					PreparedStatement stmt = con.prepareStatement("select * from userinfo");
					ResultSet rs = stmt.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getString(1) + " " +
								rs.getString(2) + " " + rs.getString(3) + " " +
								rs.getString(4) + " ");
					}
					con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
