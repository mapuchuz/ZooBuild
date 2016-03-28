package org.jee.zoo.model;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class Accueil {

//	static private List<Enclos>enclos= 	new ArrayList<>();

	public String enclos() {
		return "enclos";
	}
	public String animaux() {
		return "animaux";
	}
	public String sandbox() {
		return "sandbox";
	}
	public String visites() {
		return "visites";
	}
	public String addAnimal() {
		return "addAnimal";
	}
}
