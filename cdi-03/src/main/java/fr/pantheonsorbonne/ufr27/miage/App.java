package fr.pantheonsorbonne.ufr27.miage;


import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import fr.pantheonsorbonne.ufr27.miage.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class App {

    @Inject
    private Repository<User> repo;


    public Repository<User> getRepo() {
        return repo;
    }

    public void setRepo(Repository<User> repo) {
        this.repo = repo;
    }
}
