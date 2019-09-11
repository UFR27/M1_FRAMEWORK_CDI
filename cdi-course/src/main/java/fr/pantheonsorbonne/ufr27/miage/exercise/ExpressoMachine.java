package fr.pantheonsorbonne.ufr27.miage.exercise;

public  class ExpressoMachine implements CoffeeMachine {
	public Coffee getCoffee() {
		return new ExpressoCoffee();
	}
}