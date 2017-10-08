

import java.sql.*;


public class Mariadb_testing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection connection = 
				DriverManager.getConnection("jdbc:mariadb://localhost:3306/organization?"
						+ "user=root&password=root");
		Statement stmt = connection.createStatement();
//		stmt.executeUpdate("CREATE TABLE a "
//				+ "(id int not null primary key, value varchar(20))");
		
		stmt.executeUpdate("Insert Into a Value(9,'hey')");
//		stmt.executeUpdate("Insert Into a Value(3,'ll')");
		
		System.out.println("insert successfully");
		stmt.close();
		connection.close();
	
	}
	

}
