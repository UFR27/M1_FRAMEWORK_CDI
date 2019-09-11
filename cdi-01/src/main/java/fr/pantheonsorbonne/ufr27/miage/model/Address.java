package fr.pantheonsorbonne.ufr27.miage.model;

public class Address {

	public String getStreet() {
		return street;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	private final String street;
	private final String zip;
	private final String country;

	public Address(String street, String zip, String country) {
		this.street = street;
		this.zip = zip;
		this.country = country;
	}

}
