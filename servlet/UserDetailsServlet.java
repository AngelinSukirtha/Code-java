package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.*;
import com.chainsys.model.*;

/**
 * Servlet implementation class UserDetailsServlet
 */
public class UserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static UserDetails userDetails = new UserDetails();
	static UserDetailsDAO userDetailsDAO = new UserDetailsDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserDetailsServlet() {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("delete");
		userDetails.setEmail(email);

		try {
			userDetailsDAO.delete(email);
			PrintWriter writer = response.getWriter();
			writer.println(userDetails.getEmail() + "delete");
			List<UserDetails> list = userDetailsDAO.read();
			request.setAttribute("list", list);

			request.getRequestDispatcher("userDetails.jsp").forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

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

		String action = request.getParameter("action");
		if (action != null && !action.isEmpty()) {
			switch (action) {
			case "register":
				try {

					if (userDetailsDAO.userRegistration(userDetails)) {
						response.sendRedirect("login.jsp");
					} else {
						response.sendRedirect("index.jsp");
					}

				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;

			case "login":
				try {
					String email1 = userDetailsDAO.userLogin(userDetails);
					if (email.equals(email1)) {
						UserDetails userId = userDetailsDAO.getUserById(userDetails);

						HttpSession session = request.getSession();
						session.setAttribute("userId", userId);

						List<UserDetails> list = null;
						list = userDetailsDAO.read();
						request.setAttribute("list", list);

						request.getRequestDispatcher("userDetails.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
				}

				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;

			default:
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}

	}
}
