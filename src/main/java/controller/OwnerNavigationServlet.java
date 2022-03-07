package main.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.model.Owner;

/**
 * Servlet implementation class OwnerNavigationServlet
 */
@WebServlet("/ownerNavigationServlet")
public class OwnerNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerNavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String selection = request.getParameter("doThisToCars");
		OwnerHelper oh = new OwnerHelper();
		
		if (selection == null) {
			
			getServletContext().getRequestDispatcher("/displayOwnersServlet").forward(request, response);
			
		}else if (selection.equals("delete")) {
			
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Owner ownerToDelete = oh.searchForOwnerById(tempId);
				System.out.println("Processing Delete");
				oh.deleteOwner(ownerToDelete);
			}
			catch (NumberFormatException e) {
				System.out.println("Forgot to click a button");
			}
			finally {
				getServletContext().getRequestDispatcher("/displayOwnersServlet").forward(request, response);
			}
			
		}else if (selection.equals("Add New Cars")){
			
			getServletContext().getRequestDispatcher("/addCars.jsp").forward(request, response);
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
