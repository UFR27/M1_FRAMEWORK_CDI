package fr.pantheonsorbonne.ufr27.miage;



import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import jakarta.inject.Inject;


public class App {

	@Inject
	public Repository<User> repo;


}
