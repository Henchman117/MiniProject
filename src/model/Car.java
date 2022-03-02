package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "OWNER")
	private Owner Owner;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	
	public int getId() {
		return id;
	}
	public Owner getOwner() {
		return Owner;
	}
	public void setOwner(Owner owner) {
		Owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
