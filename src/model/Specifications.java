package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="specifications")
public class Specifications {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "HP")
	private int horsepower;
	@Column(name = "TORQUE")
	private int torque;
	@Column(name = "DISPLACENET")
	private double displacement;
	@Column(name = "MPG")
	private int milesPerGalon;
	
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
	public int getMilesPerGalon() {
		return milesPerGalon;
	}
	public void setMilesPerGalon(int milesPerGalon) {
		this.milesPerGalon = milesPerGalon;
	}
	
	
}
