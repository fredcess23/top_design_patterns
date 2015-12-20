package com.designpatterns.strategy.flyingbehavior.impl;

import com.designpatterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	public void fly() {
		System.out.println("I can not fly");
	}

	
}
