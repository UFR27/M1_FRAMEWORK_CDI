package fr.pantheonsorbonne.ufr27.miage.model;

public class CreditCard {

	final String number;
	final String holderName;
	final String expiracy;

	public CreditCard(String number, String holderName, String expiracy) {
		this.number = number;
		this.holderName = holderName;
		this.expiracy = expiracy;
	}

	public String getNumber() {
		return number;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getExpiracy() {
		return expiracy;
	}

}
