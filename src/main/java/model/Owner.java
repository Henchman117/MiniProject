package main.java.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="owners")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private OwnerName ownerName;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinTable
	private List<Car> cars;
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(OwnerName ownerName, List<Car> cars) {
		super();
		this.ownerName = ownerName;
		this.cars = cars;
	}
	
	public int getId() {
		return id;
	}
	public OwnerName getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(OwnerName ownerName) {
		this.ownerName = ownerName;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}
