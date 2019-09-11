package fr.pantheonsorbonne.ufr27.miage.exercise;

public  class BlackCoffeeMachine implements CoffeeMachine {
	public Coffee getCoffee() {
		return new BlackCoffee();
	}
}