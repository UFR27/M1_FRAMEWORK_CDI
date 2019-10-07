package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;

public class Client {

	public static final int STANDARD_AWAKENESS_LEVEL = -6;
	private int awakenessLevel;

	public int getAwakenessLevel() {
		return awakenessLevel;
	}

	public Client() {
		this.awakenessLevel = STANDARD_AWAKENESS_LEVEL;
	}

	public Client(final int awakenessLevel) {
		this.awakenessLevel = awakenessLevel;
	}

	public void drink(Coffee c) throws CoffeeOverLoadException {
		this.awakenessLevel += c.caffeineLevel();
		if (this.awakenessLevel > 6) {
			throw new CoffeeOverLoadException();
		}
	}

	public boolean isAwake() {
		return this.awakenessLevel >= 0;
	}
}