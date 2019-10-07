package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;

class Waiter {

	CoffeeMachine machine;

	public Waiter(CoffeeMachine machine) {
		this.machine = machine;
	}

	public Coffee serveCoffee() {

		return machine.getCoffee();
	}

}