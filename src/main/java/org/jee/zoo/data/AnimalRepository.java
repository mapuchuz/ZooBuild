package org.jee.zoo.data;



import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jee.zoo.model.Animal;


@ApplicationScoped
public class AnimalRepository {

	@Inject
	EntityManager em;

	public List<Animal> findAllAnimal() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Animal> criteria = 
        		cb.createQuery(Animal.class);
        Root<Animal> animal = criteria.from(Animal.class);
        criteria.select(animal).orderBy(cb.asc(animal.get("name")));
        List<Animal>tata=  em.createQuery(criteria).getResultList();
        System.out.println("list animal: " + tata.size());
        return tata;
//        return em.createQuery(criteria).getResultList();
	}
}
