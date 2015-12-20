package com.designpatterns.strategy.flyingbehavior.impl;

import com.designpatterns.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	public void fly() {
		System.out.println("I am flying !");
	}

}
