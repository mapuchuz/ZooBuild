package org.jee.zoo.enclos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enclos {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	
	private String photo;

	public Enclos() {

	}

	public Enclos(String nom) {
		this.name = nom;
	}

	public Enclos(String nom, String photo) {
		this.name = nom;
		this.photo = photo;
	}


	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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
	
	

	// private static List<Animal>animaux= new ArrayList<>();

	// public void add(Animal animal){
	// animaux.add(animal);
	// }
	// public void remove(Animal animal){
	// animaux.remove(animal);
	// }

	// public static List<Animal> getAnimaux() {
	// return animaux;
	// }
	// public static void setAnimaux(List<Animal> animaux) {
	// Enclos.animaux = animaux;
	// }

}
