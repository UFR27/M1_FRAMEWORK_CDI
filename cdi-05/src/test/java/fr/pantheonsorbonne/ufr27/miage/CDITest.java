package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;


import fr.pantheonsorbonne.ufr27.miage.service.Service;

@EnableWeld
public class CDITest {

	@WeldSetup
	public WeldInitiator weld = WeldInitiator
			.of(WeldInitiator.createWeld().addPackages(Package.getPackage("fr.pantheonsorbonne.ufr27.miage.service")));

	@Inject
	Service impl;

	@Test
	public void testCrible() {
		assertEquals(9973, impl.compute(4));
	}

}
