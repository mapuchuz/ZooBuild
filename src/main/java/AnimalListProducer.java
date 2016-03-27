

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;


@RequestScoped
public class AnimalListProducer {

	@Inject
	AnimalRepository animalRepository;
	
	private List<Animal> animals;
	
	@Produces
	@Named
	public List<Animal>getAnimals() {
		System.out.println("temoin in getAnimals");
		return animals;
	}
	
    public void onMemberListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Animal animal) {
        retrieveAllMembersOrderedByName();
    }

    @PostConstruct
    public void retrieveAllMembersOrderedByName() {
        animals= animalRepository.findAllAnimal();
    }
}

