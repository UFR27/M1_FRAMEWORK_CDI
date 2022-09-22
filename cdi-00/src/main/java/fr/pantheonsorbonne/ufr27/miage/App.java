package fr.pantheonsorbonne.ufr27.miage;



import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class App {

	public Repository<User> getRepo() {
		return repo;
	}

	public void setRepo(Repository<User> repo) {
		this.repo = repo;
	}

	@Inject
	private Repository<User> repo;


}
