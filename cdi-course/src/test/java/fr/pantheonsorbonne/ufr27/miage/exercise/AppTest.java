package fr.pantheonsorbonne.ufr27.miage.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;

public class AppTest {

	@Test
	public void testCase1() {

		try {
			Waiter waiter = new Waiter();

			Client client = new Client(-5);
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee();
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

	@Test
	public void testCase2() {

		try {
			Waiter waiter = new Waiter();

			Client client = new Client(-19);
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee();
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

}
