package main.java.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="owners")
public class Owner {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String ownerName;
	@JoinColumn(name = "oc_fk", )
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<Car> cars;
	
	public int getId() {
		return id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}
