package com.designpatterns.strategy;

import com.designpatterns.strategy.flyingbehavior.impl.FlyNoWay;
import com.designpatterns.strategy.quackingbehavior.impl.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay(); //By default
		quackBehavior = new Quack(); //By default
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
		
	}

}
