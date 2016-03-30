package org.jee.zoo.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.jee.zoo.data.IAnimalRepository;
import org.jee.zoo.model.Animal;


@Stateless
public class AnimalRegistration implements IAnimalRegistration {

    @Inject
    private Logger log;

    @Inject
    private IAnimalRepository animalRepository;

    @Inject
    private Event<Animal> animalEventSrc;

    @Override
    public void register(Animal animal) throws Exception {
        log.info("Registering " + animal.getName());
        animalRepository.register( animal );
        animalEventSrc.fire(animal);
    }
}
