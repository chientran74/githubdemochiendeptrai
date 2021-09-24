package edu.fa.model;

public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
