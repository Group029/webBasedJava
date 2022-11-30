package example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCounrServlet
 */
@WebServlet("/hitCountServlet")
public class HitCounrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Obtaining a Session
		HttpSession session = request.getSession();
		boolean newlyCreated = session.isNew();
		int hitCount = 0;
		if(newlyCreated) {
			hitCount = 1;
		}
		else {
			//Obtain the latest count
			Object obj = session.getAttribute("latestCount");
			hitCount = (Integer)obj;
			hitCount++;
		}
		//Store the Hit Count value inside the Session
		session.setAttribute("latestCount", hitCount);
		out.println("<h2>Hit Count: " + hitCount + "</h2>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("counter.html");
		dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
