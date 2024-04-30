package com.chainsys.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		update();
		insert();
		delete();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root",
				"Angelin#18");
		return connection;
	}

	public static void update() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "update hospital set DOB='2024-12-15'where patient_id=1";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Updated Table");
		preparedStatement.execute();
		connection.close();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "insert into hospital values(6,'AAA','Flora',9445676543,'2023-12-15')";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Insert Table");
		preparedStatement.execute();
		connection.close();
	}

	public static void delete() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "delete from hospital where patient_id = 2;";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Delete Table");
		preparedStatement.execute();
		connection.close();
	}
}