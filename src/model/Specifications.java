package model;

public class Specifications {
	private int id;
	private int horsepower;
	private int torque;
	private double displacement;
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
