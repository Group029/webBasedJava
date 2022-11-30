package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.beans.Course;

/**
 * Servlet implementation class DisplayCourseServlet
 */
@WebServlet("/displayCourseServlet")
public class DisplayCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Retrieving the Request Scoped attribute named as 'currentCourse'
		Object obj = request.getAttribute("currentCourse");
		Course crs = (Course)obj;
		String courseName = crs.getName();
		int courseDuration = crs.getDuration();
		int courseFees = crs.getFees();
		out.println("<h2>Showing the course details here with: </h2>");
		out.println("<h2>Name of the course: " + courseName + "</h2>");
		out.println("<h2>Duration: " + courseDuration + " days</h2>");
		out.println("<h2>Fees: " + courseFees + " INR</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
