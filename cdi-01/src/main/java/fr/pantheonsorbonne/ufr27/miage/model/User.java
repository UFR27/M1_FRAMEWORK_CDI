package fr.pantheonsorbonne.ufr27.miage.model;

public class User {

	static int count = 0;
	int id;
	String name;

	public User() {
		this.id = count++;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
