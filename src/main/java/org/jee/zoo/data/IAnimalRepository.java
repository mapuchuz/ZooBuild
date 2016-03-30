package org.jee.zoo.data;

import java.util.List;

import org.jee.zoo.model.Animal;
import org.jee.zoo.model.AnimalReduced;

public interface IAnimalRepository {

	Animal findById(int id);

	Animal findByName(String name);

	List<Animal> findAllAnimal();

	void register(Animal member) throws Exception;

	List<AnimalReduced> findAllAnimalReduced();

}