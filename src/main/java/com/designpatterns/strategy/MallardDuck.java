package com.designpatterns.strategy;

import com.designpatterns.strategy.flyingbehavior.impl.FlyWithWings;
import com.designpatterns.strategy.quackingbehavior.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack(); //By default
		flyBehavior = new FlyWithWings(); //By default
	}
	
	public void display(){
		System.out.println("I am a real Mallard duck");
	}
	
}
