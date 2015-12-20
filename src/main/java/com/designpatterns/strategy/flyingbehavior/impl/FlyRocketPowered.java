package com.designpatterns.strategy.flyingbehavior.impl;

import com.designpatterns.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{

	public void fly(){
		System.out.println("I am flying with a rocket!");
	}
	
}
