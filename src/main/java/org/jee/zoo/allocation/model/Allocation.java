package org.jee.zoo.allocation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.jee.zoo.animal.model.Animal;
import org.jee.zoo.enclos.model.Enclos;


@Entity
public class Allocation {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	private Animal animal;
	
	@OneToOne
	private Enclos enclos;
	
	public Allocation() {
		
	}
	
	public Allocation(Animal animal, Enclos enclos) {
		this.animal= animal;
		this.enclos= enclos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Enclos getEnclos() {
		return enclos;
	}

	public void setEnclos(Enclos enclos) {
		this.enclos = enclos;
	}


	
}
