
package Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementInsert {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/college?characterEncoding=latin1","root","Vbmvbm@2223"); 
					PreparedStatement stmt = con.prepareStatement("insert into userinfo values (?,?,?,?,?)");
							stmt.setString(1,"user4");
							stmt.setString(2,"pass4");
							stmt.setString(3,"user4@gmail.com");
							stmt.setString(4, "abc");
							stmt.setString(5, "60");
							int i = stmt.executeUpdate();
							System.out.println(i + "Records inserted..");
							con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}