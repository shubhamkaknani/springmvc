package org.studyeasy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getParameter("page");
		if(param.equals("login"))
		{
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else if(param.equals("Signup"))
		{
			getServletContext().getRequestDispatcher("/Signup.jsp").forward(request, response);
		}
		else if(param.equals("About"))
		{
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		}
		else
		{
			getServletContext().getRequestDispatcher("/notfoundjsp.jsp").forward(request, response);
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
