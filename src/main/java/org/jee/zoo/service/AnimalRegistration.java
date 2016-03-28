package org.jee.zoo.service;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jee.zoo.model.Animal;

import java.util.logging.Logger;


@Stateless
public class AnimalRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Animal> memberEventSrc;

    public void register(Animal animal) throws Exception {
        log.info("Registering " + animal.getName());
        em.persist(animal);
        memberEventSrc.fire(animal);
    }
}
