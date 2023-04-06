package aplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

import db.DB;
import db.DBException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Connection connection = null;
		Statement statement = null;
		
		
		try {
			connection = DB.getConnection();

			connection.setAutoCommit(false);

			statement = connection.createStatement();

			int update1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1"); 

			/*
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}
			*/

			int update2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			connection.commit();

			System.out.println("Update 1: " + update1);
			System.out.println("Update 2: " + update2);

		} catch (SQLException e) {
			try {
				connection.rollback();
				throw new DBException(e.getMessage() + ". Rolling back");
			} catch (SQLException e1) {
				throw new DBException("Rollback error: " + e1.getMessage());
			}
		} finally {
			
			DB.closeConnection();
		}
		
	}

}
