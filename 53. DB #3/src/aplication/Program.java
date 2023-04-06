package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import java.sql.Statement;

import db.DB;
import db.DBException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SimpleDateFormat dFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			connection = DB.getConnection();
			/*
			preparedStatement = connection.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, "Paul Pink");
			preparedStatement.setString(2, "pink@email.com");
			preparedStatement.setDate(3, new java.sql.Date(dFormat.parse("04/02/2023").getTime()));
			preparedStatement.setDouble(4, 3000.00);
			preparedStatement.setInt(5, 4);
			*/

			preparedStatement = connection.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);

			int update = preparedStatement.executeUpdate();

			if (update > 0) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				while (resultSet.next()) {
					int id = resultSet.getInt(1);
					System.out.println("Id = " + id);
				}
			} else {
				System.out.println("No rown affected");
			}

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		/*} catch (ParseException e) {
			e.printStackTrace();
		*/} finally {
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
		
	}

}
