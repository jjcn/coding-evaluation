package com.aa.act.interview.org;

public class Employee {

	private int identifier = 0;
	private Name name;

	public Employee(Name name) {
		if(name == null)
			throw new IllegalArgumentException("name cannot be null");
		this.identifier = name.hashCode();
		this.name = name;
	}

	public Employee(int identifier, Name name) {
		if(name == null)
			throw new IllegalArgumentException("name cannot be null");
		this.identifier = identifier;
		this.name = name;
	}
	
	public int getIdentifier() {
		return identifier;
	}
	
	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return name.toString() + ": " + identifier;
	}
}
