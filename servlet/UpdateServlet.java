package com.chainsys.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.UserDetailsDAO;
import com.chainsys.model.UserDetails;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static UserDetails userDetails = new UserDetails();
	static UserDetailsDAO userDetailsDAO = new UserDetailsDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		userDetails.setUserName(userName);
		userDetails.setUserPassword(userPassword);
		userDetails.setPhoneNumber(phoneNumber);
		userDetails.setEmail(email);

		try {
			userDetailsDAO.update(userDetails);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		List<UserDetails> list = null;
		try {
			list = userDetailsDAO.read();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("userDetails.jsp");
		dispatcher.forward(request, response);
	}

}
