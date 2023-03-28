package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

/**
 * @author Karolayne Silva
 * @author Erika Santos
 * @author Gilmar Adrian
 *
 */
public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		int Id;
		String name;
		
		try {
			conn = DB.getConnection();
	
			// Statement - Declaração de conexão
			st = conn.createStatement();
			
			// Result Set - Conjunto de Resultados
			rs = st.executeQuery("SELECT * FROM department");
			
			while (rs.next()) {
				Id = rs.getInt("Id");
				name = rs.getString("Name");
				System.out.println(Id + " - " + name);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}