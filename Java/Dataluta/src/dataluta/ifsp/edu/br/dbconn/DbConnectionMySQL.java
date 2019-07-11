package dataluta.ifsp.edu.br.dbconn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbConnectionMySQL {

	protected Connection conn;
	protected String userName;
	protected String password;
	protected String dbName;

	public DbConnectionMySQL() {
		this.conn = this.getConnection();
	}

	public Connection getConnection() {
		String connectionURL = "jdbc:mysql://localhost:3306/dataluta_db";

		try {
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "45810000");
			properties.setProperty("useSSL", "false");
			properties.setProperty("autoReconnect", "true");
			

			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(connectionURL, properties);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return this.conn;
	}

	public ResultSet buscarRegistros(String queryComando) throws SQLException {
		Statement sql;
		ResultSet registros = null;
		sql = conn.createStatement();
		registros = sql.executeQuery(queryComando);
		return registros;
	}

	public boolean executarComando(String queryComando) throws SQLException {
		Statement sql;
		boolean resultado = false;
		sql = conn.createStatement();
		sql.execute(queryComando);
		resultado = true;
		return resultado;
	}
	
	public void executarSP(String str) throws SQLException{
		CallableStatement cs = this.conn.prepareCall(str);
		cs.execute();
	}

}
