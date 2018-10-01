package mx.edu.uacm.aserciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	//parametros de conexion
	public static String db = "dbGenerica";
	public final String url = "jdbc:mysql://localhost/" + db + "?";
	public final String user = "admin";
	public final String pass = "1234";
	
	
	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(this.url + "user=" + this.user +"&password=" + this.pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
