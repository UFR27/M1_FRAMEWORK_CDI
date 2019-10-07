package fr.pantheonsorbonne.ufr27.miage;

import javax.inject.Inject;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import fr.pantheonsorbonne.ufr27.miage.model.User;

/**
 * Hello world!
 *
 */
public class App {

	@Inject
	public Repository<User> repo;


}
