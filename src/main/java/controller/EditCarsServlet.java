package main.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.model.Specifications;

/**
 * Servlet implementation class EditCarsServlet
 */
@WebServlet("/editCarServlet")
public class EditCarsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCarsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SpecificationsHelper sh = new SpecificationsHelper();
		
		String horsepower = request.getParameter("hp");
		String torque = request.getParameter("torque");
		String displacement = request.getParameter("displacement");
		String mpg = request.getParameter("mpg");
		System.out.println(request.getParameter("id"));
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		Specifications specsToUpdate = sh.searchForSpecsId(tempId);
		specsToUpdate.setHorsepower(Integer.parseInt(horsepower));
		specsToUpdate.setTorque(Integer.parseInt(torque));
		specsToUpdate.setDisplacement(Double.parseDouble(displacement));
		specsToUpdate.setMilesPerGallon(Integer.parseInt(mpg));
		
		sh.updateSpecs(specsToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
