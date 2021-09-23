package fr.pantheonsorbonne.ufr27.miage;


import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import jakarta.inject.Inject;
import jakarta.inject.Named;


public class App {

	@Inject
	@Named("h2")
	public Repository<User> repo;

}
