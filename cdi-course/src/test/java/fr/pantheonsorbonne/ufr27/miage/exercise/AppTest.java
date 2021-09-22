package fr.pantheonsorbonne.ufr27.miage.exercise;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.BlackCoffeeMachine;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.ExpressoMachine;

public class AppTest {

	@Test
	public void testCase1() {

		try {
			
			
			
			Waiter waiter = new Waiter(new BlackCoffeeMachine());
			
			Client client = new Client(-3);
			
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
			Waiter waiter = new Waiter(new ExpressoMachine());

			Client client = new Client(-20);
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
