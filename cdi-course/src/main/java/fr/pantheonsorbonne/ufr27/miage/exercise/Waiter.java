package fr.pantheonsorbonne.ufr27.miage.exercise;

class Waiter {
	private CoffeeMachine machine = new ExpressoMachine();

	public Coffee serveCoffee() {
		return machine.getCoffee();
	}

}