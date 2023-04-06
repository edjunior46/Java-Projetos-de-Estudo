package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement("UPDATE seller SET BaseSalary = ? WHERE (DepartmentId = ?)");

			preparedStatement.setDouble(1, 5000.00);
			preparedStatement.setInt(2, 1);

			int update = preparedStatement.executeUpdate();

			System.out.println("Updated rows: " + update);

		} catch (SQLException e) {
		} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
		
	}

}
