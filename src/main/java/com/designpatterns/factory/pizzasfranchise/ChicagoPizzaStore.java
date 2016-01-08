package com.designpatterns.factory.pizzasfranchise;

public class ChicagoPizzaStore extends PizzaStore {

	// A factory method handles the object creation and encapsulates it in a
	// subclass

	Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();

		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();

		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();

		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();

		} else
			return null;
	}
}