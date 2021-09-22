package fr.pantheonsorbonne.ufr27.miage;


import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import fr.pantheonsorbonne.ufr27.miage.model.User;
import jakarta.inject.Inject;

/**
 * Hello world!
 */
public class App {

    @Inject
    public Repository<User> repo;


}
