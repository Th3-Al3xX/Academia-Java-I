package crud;

import java.sql.*;

public class teste {

	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String DB_URL = "jdbc:mariadb://localhost:3306/aula";
	
	static final String USUARIO = "root";
	static final String SENHA = "root";
	
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			System.out.println("CONECTANDO ...");
			Class.forName(JDBC_DRIVER);
			con=DriverManager.getConnection(DB_URL,USUARIO,SENHA);
			System.out.println("CONECTADO ...");					
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
