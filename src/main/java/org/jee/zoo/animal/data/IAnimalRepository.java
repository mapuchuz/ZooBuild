package org.jee.zoo.animal.data;

import java.util.List;

import org.jee.zoo.animal.model.Animal;
import org.jee.zoo.animal.model.AnimalReduced;

public interface IAnimalRepository {

	Animal findById(int id);

	Animal findByName(String name);

	List<Animal> findAllAnimal();

	void register(Animal member) throws Exception;

	List<AnimalReduced> findAllAnimalReduced();

}