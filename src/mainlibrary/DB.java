
package mainlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	Connection con;
	public Connection getConnection() {
		String url,user,pwd;
		url="jdbc:mysql://localhost:3306/library";
		user="root";
		pwd="Date@2004";
	
		try {
		
			con =DriverManager.getConnection(url, user, pwd);
           
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
