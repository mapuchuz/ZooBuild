package org.jee.zoo.visit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Visit {

	@Id
	@GeneratedValue
	int 	id;
	
	Visitor	visitor;
	Date 	date;
	int 	nAdult;
	int 	nChild;
	Double 	price;
	
	public Visit() {
		
	}
	public Visit(Date date, int nAdult, int nChild) {
		this.date=		date;
		this.nAdult=	nAdult;
		this.nChild=	nChild;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getnAdult() {
		return nAdult;
	}
	public void setnAdult(int nAdult) {
		this.nAdult = nAdult;
	}
	public int getnChild() {
		return nChild;
	}
	public void setnChild(int nChild) {
		this.nChild = nChild;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Visitor getVisitor() {
		return visitor;
	}
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	
	
}

