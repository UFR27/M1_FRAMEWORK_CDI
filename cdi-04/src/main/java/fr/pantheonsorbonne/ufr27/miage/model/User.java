package fr.pantheonsorbonne.ufr27.miage.model;

public class User {

	static long count = 0;
	long id;
	String name;

	public User() {
		this.id = count++;
	}

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long i) {
		this.id=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
