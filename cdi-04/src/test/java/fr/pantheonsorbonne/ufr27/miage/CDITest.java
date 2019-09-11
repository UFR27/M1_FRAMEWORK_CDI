package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.pantheonsorbonne.ufr27.miage.service.Service;
import fr.pantheonsorbonne.ufr27.miage.service.ServiceImpl;

public class CDITest {

	@Test
	public void testCrible() {
		Service impl = new ServiceImpl();
		assertEquals(9973, impl.compute(4));
	}

}
