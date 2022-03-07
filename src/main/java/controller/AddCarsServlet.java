package main.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.model.Car;
import main.java.model.Specifications;

/**
 * Servlet implementation class AddCarsServlet
 */
@WebServlet("/addCarsServlet")
public class AddCarsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Declaration
		String model = request.getParameter("model");
		String manufacturer = request.getParameter("manufacturer");
		String horsepower = request.getParameter("hp");
		String torque = request.getParameter("torque");
		String displacement = request.getParameter("displacement");
		String mpg = request.getParameter("mpg");
		CarHelper ch = new CarHelper();
		Specifications specs = new Specifications(Integer.parseInt(horsepower), Integer.parseInt(torque), Double.parseDouble(displacement), Integer.parseInt(mpg));
		
		Car car = new Car(model,manufacturer,specs);
		
		ch.addCar(car);
		
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
