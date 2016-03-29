package org.jee.zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="Animal")
public class AnimalReduced {


	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String espece;
	
	
	public  AnimalReduced() {
	}

	public AnimalReduced(String name, String espece) {
		this.name = name;
		this.espece = espece;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

}
