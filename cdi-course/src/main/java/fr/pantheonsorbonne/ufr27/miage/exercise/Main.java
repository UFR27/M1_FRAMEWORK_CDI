package fr.pantheonsorbonne.ufr27.miage.exercise;

public class Main {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		Coffee coffee = waiter.serveCoffee();
		Client client = new Client();
		client.drink(coffee);
	}

}
