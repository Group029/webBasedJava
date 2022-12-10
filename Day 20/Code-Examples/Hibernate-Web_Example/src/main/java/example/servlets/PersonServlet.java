package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.bean.PersonService;
import example.hibernate.annotation.entity.Person;

/**
 * Servlet implementation class PersonServlet
 */
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalDate birthDate = 	LocalDate.of(1968, 12, 20);
		Person person = new Person(101, "Madhuri Dixit", "madhuri@gmail.com", birthDate);
		PersonService.createNewPerson(person);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Person added</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
