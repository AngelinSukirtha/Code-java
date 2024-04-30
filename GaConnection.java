package com.chainsys.grocery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GaConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		update();
		insert();
		delete();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/groceryapp", "root",
				"Angelin#18");
		return connection;
	}

	public static void update() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "update grocery set discount=20";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Updated Table");
		preparedStatement.execute();
		connection.close();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "insert into grocery values('Millet','Grains',25,'20')";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Insert Table");
		preparedStatement.execute();
		connection.close();
	}

	public static void delete() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "delete from grocery where price=10";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Delete Table");
		preparedStatement.execute();
		connection.close();
	}
}
