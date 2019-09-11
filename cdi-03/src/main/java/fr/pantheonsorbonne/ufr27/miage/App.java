package fr.pantheonsorbonne.ufr27.miage;

import javax.inject.Inject;

import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import fr.pantheonsorbonne.ufr27.miage.qualifier.InMemory;

/**
 * Hello world!
 *
 */
public class App {

	@Inject @InMemory
	public Repository<User> repo;


}
