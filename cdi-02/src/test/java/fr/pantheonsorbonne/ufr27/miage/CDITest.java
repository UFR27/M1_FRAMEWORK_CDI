package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.junit.jupiter.api.Test;

import fr.pantheonsorbonne.ufr27.miage.model.User;

public class CDITest {

	@Test
	public void shouldAnswerWithTrue() {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();

		try (SeContainer container = initializer.addPackages(true, App.class).initialize()) {
			App app = container.select(App.class).get();
			User u = new User();
			u.setName("toto");
			app.repo.save(u);
			User u2 = app.repo.find(u.getId());
			assertTrue(u.getName().equals(u2.getName()));

		}

	}
}
