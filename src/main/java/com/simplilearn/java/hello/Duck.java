package com.simplilearn.java.hello;

public class Duck extends Animal {

	private String feet = "webbed";
	
	public void walk () {
		System.out.println ("waddle");
	}
	
	public void quack () {
		;
	}
	
	public String toString () {
		return "Daffy";
	}
	
	public String getFeet () {
		return feet;
	}
	
	public void setFeet (String feet) {
		this.feet = feet;
	}
}
