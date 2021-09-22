package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;

class Waiter {

	private final CoffeeMachine coffeMachine;

	public Waiter(CoffeeMachine coffeMachine) {
		this.coffeMachine = coffeMachine;
	}

	public Coffee serveCoffee() {

		return this.coffeMachine.getCoffee();
	}

}
