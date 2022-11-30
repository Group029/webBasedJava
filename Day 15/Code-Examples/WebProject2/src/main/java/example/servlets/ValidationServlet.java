package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.beans.User;
import example.beans.UserValidator;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(name = "validation", urlPatterns = { "/doValidate" })
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Retrieving request specific parameters
		String username = request.getParameter("userId");
		String password = request.getParameter("pwd");
		
		//Populating a User object based upon username and password
		User currentUser = new User(username, password);
		boolean valid = UserValidator.isValid(currentUser);
		
		String htmlResponse = 
				"<h1 style='color:white;background-color:red'>Sorry, Access Denied</h1>";
		if(valid) {
			htmlResponse = 
			"<h1 style='color:white;background-color:green'>Congratulations!!, You are IN</h1>";
		}
		out.println(htmlResponse);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
