package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Owner Owner;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	private Specifications specs;
	
	
	/**
	 * @return the specs
	 */
	public Specifications getSpecs() {
		return specs;
	}
	/**
	 * @param specs the specs to set
	 */
	public void setSpecs(Specifications specs) {
		this.specs = specs;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
