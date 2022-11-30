package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.beans.Course;
import example.beans.CourseService;

/**
 * Servlet implementation class SearchCourseServlet
 */
@WebServlet("/searchCourseServlet")
public class SearchCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String courseId = request.getParameter("courseId");
		Course searchedCourse = CourseService.getCourseById(courseId);
		RequestDispatcher dispatcher = null;
		if(searchedCourse != null) {
			dispatcher = request.getRequestDispatcher("displayCourseServlet");
			//Attach the found course to the current request
			request.setAttribute("currentCourse", searchedCourse);
			dispatcher.forward(request, response);
		}
		else {
			out.println("<h2>The entered course ID does not exist. Please try again!! </h2>");
			dispatcher = request.getRequestDispatcher("searchCourse.html");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
