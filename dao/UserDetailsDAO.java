package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.chainsys.model.*;
import com.chainsys.util.MySQLConnection;

public class UserDetailsDAO {

	public boolean userRegistration(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getConnection();
		String query = "SELECT *"
				+ " FROM UserDetails WHERE user_name=? AND user_password=? AND phone_number=? AND email=?";
		PreparedStatement statement = connection.prepareStatement(query);
		try {
			statement.setString(1, userDetails.getUserName());
			statement.setString(2, userDetails.getUserPassword());
			statement.setString(3, userDetails.getPhoneNumber());
			statement.setString(4, userDetails.getEmail());
			ResultSet resultSet = statement.executeQuery();
			if (!resultSet.next()) {
				String insert = "INSERT INTO UserDetails (user_name,user_password,phone_number,email) VALUES (?, ?, ?, ?)";
				PreparedStatement p = connection.prepareStatement(insert);
				try {
					p.setString(1, userDetails.getUserName());
					p.setString(2, userDetails.getUserPassword());
					p.setString(3, userDetails.getPhoneNumber());
					p.setString(4, userDetails.getEmail());
					p.execute();
				} finally {
					try {
						p.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public String userLogin(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		String email = null;
		Connection connection = MySQLConnection.getConnection();
		String query = "SELECT email FROM  UserDetails  WHERE email=?";
		PreparedStatement statement = connection.prepareStatement(query);
		try {
			statement.setString(1, userDetails.getEmail());
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				email = resultSet.getString(1);
			}
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return email;
	}

	public List<UserDetails> read() throws ClassNotFoundException, SQLException {
		List<UserDetails> list = new ArrayList<>();
		Connection connection = MySQLConnection.getConnection();
		String read = "SELECT *" + " FROM UserDetails";
		PreparedStatement statement = connection.prepareStatement(read);
		try {
			ResultSet rows = statement.executeQuery();
			while (rows.next()) {
				int userId = rows.getInt("user_id");
				String userName = rows.getString("user_name");
				String userPassword = rows.getString("user_password");
				String phoneNumber = rows.getString("phone_number");
				String email = rows.getString("email");
				list.add(new UserDetails(userId, userName, userPassword, phoneNumber, email));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public boolean delete(String email) throws ClassNotFoundException, SQLException {
		boolean rowDeleted;
		String delete = "DELETE FROM UserDetails WHERE email=?";
		try (Connection connection = MySQLConnection.getConnection();
				PreparedStatement p = connection.prepareStatement(delete);) {
			p.setString(1, email);
			rowDeleted = p.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public void update(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		String update = "UPDATE UserDetails SET user_name=?, user_password=?, phone_number=? WHERE email=?";
		try (Connection connection = MySQLConnection.getConnection();
				PreparedStatement p = connection.prepareStatement(update)) {
			p.setString(1, userDetails.getUserName());
			p.setString(2, userDetails.getUserPassword());
			p.setString(3, userDetails.getPhoneNumber());
			p.setString(4, userDetails.getEmail());
			p.executeUpdate();
		}
	}

	public UserDetails getUserById(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getConnection();
		String query = "SELECT *" + " FROM UserDetails WHERE email=?";
		PreparedStatement statement = connection.prepareStatement(query);
		try {
			statement.setString(1, userDetails.getEmail());
			ResultSet rows = statement.executeQuery();
			if (rows.next()) {
				userDetails.setUserId(rows.getInt("user_id"));
				userDetails.setUserName(rows.getString("user_name"));
				userDetails.setUserPassword(rows.getString("user_password"));
				userDetails.setPhoneNumber(rows.getString("phone_number"));
				userDetails.setEmail(rows.getString("email"));
				return userDetails;
			}
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
