package main.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NavServlet
 */
@WebServlet("/navServlet")
public class NavServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selection = request.getParameter("selection");
		
		if (selection.equals("Add New Owner")) {
			
			getServletContext().getRequestDispatcher("/viewCarsServlet").forward(request, response);
			
		}else if (selection.equals("Display Garage Owners")) {
			
			getServletContext().getRequestDispatcher("/displayOwnersServlet").forward(request, response);
		}else if (selection.equals("Home Page")) {
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else if (selection.equals("Add New Cars")){
			
			getServletContext().getRequestDispatcher("/addCars.jsp").forward(request, response);
		}
		
	}

}
