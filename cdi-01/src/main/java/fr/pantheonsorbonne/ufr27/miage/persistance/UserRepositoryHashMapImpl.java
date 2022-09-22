package fr.pantheonsorbonne.ufr27.miage.persistance;

import java.util.HashMap;
import java.util.Map;



import fr.pantheonsorbonne.ufr27.miage.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

@ApplicationScoped
public class UserRepositoryHashMapImpl implements UserRepository {
	Map<Integer, User> map = new HashMap<>();

	@Override
	public void save(User t) {
		map.put(t.getId(), t);

	}

	@Override
	public User find(int id) {
		return map.get(id);
	}
}
