package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.jupiter.api.Assertions.assertTrue;


import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.pantheonsorbonne.ufr27.miage.model.User;

public class CDITest {

    SeContainerInitializer initializer;
    SeContainer container;
    App app;

    @BeforeEach
    private void setup() {
        initializer = SeContainerInitializer.newInstance();

        container = initializer.addPackages(true, App.class).initialize();
        app = container.select(App.class).get();

    }

    @AfterEach
    private void teardown() {
        container.close();
    }


    @Test
    public void shouldAnswerWithTrue() {

        User u = new User();
        u.setName("toto");
        app.repo.save(u);
        User u2 = app.repo.find(u.getId());
        assertTrue(u.getName().equals(u2.getName()));


    }
}
