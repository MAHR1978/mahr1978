package grupal6m5.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	private static Connection conn= null;
	
	private ConnectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencion_riesgos","root","anjo1978");
				if(conn !=null) {
					System.out.print("conexion correcta");
				}
				else {
					System.out.print("conexion incorrecta");
				}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static Connection getConn() {
		if(conn== null) {
			new ConnectDB();
		}
		
		return conn;
	}
	
	
	
	//public static String url = "jdbc:mysql://localhost:3306/emp_seguridad";
	//public static String user = "root";
	//public static String password = "anjo1978";
	//public static String driver = "com.mysql.cj.jdbc.Driver";
}
