package org.jee.zoo.visit.data;

import java.util.List;

import org.jee.zoo.visit.model.Visit;
import org.jee.zoo.visit.model.Visitor;

public interface VisitRepositoryInterface {

	Visit 		findById(		int id);
	List<Visit> findByVisitor(	Visitor visitor);
	void		add(			Visitor visitor, Visit visit);
	void		cancel(			Visitor visitor, Visit visit);
	void		book(			Visitor visitor, Visit visit);
	
}
