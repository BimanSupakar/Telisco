package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daocontroller.DaoLoginController;
import pojo.Emp;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		Emp e = new Emp();
		e.setName(name);
		e.setPassword(password);

		try {

			if (DaoLoginController.logindata(name, password)) {
				System.out.println("inside if");
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				session.setAttribute("password", password);
				// LoginHandlerServlet.forwardToLogin(req, resp, null);
				session.setMaxInactiveInterval(10);

				
				  String s = (String) session.getAttribute("name");
				  String p = (String) session.getAttribute("password");
				  System.out.println("this is .................is ssssssss"+s);
				  System.out.println("this is .................is pppppppp"+p);
				 
				response.sendRedirect("logout.jsp");

			} else {
				response.sendRedirect("login.html");

			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	

}
