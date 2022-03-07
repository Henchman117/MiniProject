package main.java.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.model.Car;
import main.java.model.Owner;
import main.java.model.OwnerName;

/**
 * Servlet implementation class AddOwnerServlet
 */
@WebServlet("/addOwnerServlet")
public class AddOwnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOwnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		OwnerHelper oh = new OwnerHelper();
		CarHelper ch = new CarHelper();
		String[] selectedCars = request.getParameterValues("allcars");
		String ownerName = request.getParameter("ownerName");
		List<Car> selectedCarInList = new ArrayList<Car>();
		
		if(selectedCars != null && selectedCars.length > 0) {
			for(int i = 0; i < selectedCars.length; i++) {
				Car c = ch.searchForCarId(Integer.parseInt(selectedCars[i]));
				selectedCarInList.add(c);
			}
		}
		
		OwnerName on = new OwnerName(ownerName);
		Owner o = new Owner(on, selectedCarInList);
		oh.addOwner(o);
		System.out.println("Success!");
		
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
