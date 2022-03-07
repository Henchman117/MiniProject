package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="specifications")
public class Specifications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int horsepower;
	private int torque;
	private double displacement;
	private int milesPerGallon;
	
	public Specifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Specifications(int horsepower, int torque, double displacement, int milesPerGallon) {
		super();
		this.horsepower = horsepower;
		this.torque = torque;
		this.displacement = displacement;
		this.milesPerGallon = milesPerGallon;
	}


	public int getId() {
		return id;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public double getDisplacement() {
		return displacement;
	}
	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}
	public int getMilesPerGallon() {
		return milesPerGallon;
	}
	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	
	
}
