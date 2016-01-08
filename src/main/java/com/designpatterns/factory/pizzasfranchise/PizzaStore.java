package com.designpatterns.factory.pizzasfranchise;

public abstract class PizzaStore {
	 
	abstract Pizza createPizza(String item); //factory method, acts as a factory
 
	//This method has no idea of what type of pizza was created, but it knows it is a pizza!
	public Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}