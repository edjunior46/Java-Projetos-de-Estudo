package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

import db.DB;
import db.DBIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");
			preparedStatement.setInt(1, 8);

			int update = preparedStatement.executeUpdate();

			System.out.println("Rows updated: " + update);

		} catch (SQLException e) {
			throw new DBIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
		
	}

}
