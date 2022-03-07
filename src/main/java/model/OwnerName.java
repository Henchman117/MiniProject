package main.java.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ownernames")
public class OwnerName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ownerName;
	
	public OwnerName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OwnerName(String ownerName) {
		super();
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
