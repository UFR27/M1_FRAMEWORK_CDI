package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.junit.jupiter.api.Test;

import fr.pantheonsorbonne.ufr27.miage.model.User;


public class CDITest {

	@Test
	public void testWithUserRepo() {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();

		try (SeContainer container = initializer.addPackages(true, App.class).initialize()) {
			App app = container.select(App.class).get();
			User u = new User();
			app.getRepo().save(u);
			User u2 = app.getRepo().find(u.getId());
			assertTrue(u.equals(u2));
			
			assertNotNull(app.getRepo());

		}

	}
	
//	@Test
//	public void testWithAllRepos() {
//		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
//
//		try (SeContainer container = initializer.addPackages(true, App.class).initialize()) {
//			App app = container.select(App.class).get();
//			User u = new User();
//			app.getRepo().save(u);
//			User u2 = app.getRepo().find(u.getId());
//			assertTrue(u.equals(u2));
//			
//			assertNotNull(app.getRepo());
//			assertNotNull(app.getAddrRepo());
//			assertNotNull(app.getUserRepo());
//		}
//
//	}
}
