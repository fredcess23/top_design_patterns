package com.designpatterns.factory.pizzasfranchise;

public class NYPizzaStore extends PizzaStore {

	//A factory method handles the object creation and encapsulates it in a subclass 
	
	Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		
		} else 
			return null;
	}
}
