package fr.pantheonsorbonne.ufr27.miage;

import javax.inject.Inject;

import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;


public class App {

	@Inject
	public Repository<User> repo;


}
