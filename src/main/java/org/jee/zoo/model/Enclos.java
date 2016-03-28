package org.jee.zoo.model;

import java.util.ArrayList;
import java.util.List;


public class Enclos {

	private String nom;
	private String photo;
	
	private static List<Animal>animaux= new ArrayList<>();
	
	public Enclos(String nom) {
		this.nom= nom;
	}
	public Enclos(String nom, String photo) {
		this.nom= nom;
		this.photo=	photo;
	}
	public void add(Animal animal){
		animaux.add(animal);
	}
	public void remove(Animal animal){
		animaux.remove(animal);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public static List<Animal> getAnimaux() {
		return animaux;
	}
	public static void setAnimaux(List<Animal> animaux) {
		Enclos.animaux = animaux;
	}
	
	
}
