package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("delete from eproduct where name='Television';");
		
		System.out.println("Product deleted");

		ResultSet result = stmt.executeQuery("select * from eproduct");
		
		while(result.next()){
					System.out.println("Product Id " +result.getInt("ID"));
				    System.out.println("Product Name "+result.getString("name"));
				    System.out.println("Product Price "+result.getDouble("price"));
		}
		con.close();
	}

}
