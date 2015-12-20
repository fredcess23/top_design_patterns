package com.designpatterns.strategy.quackingbehavior.impl;

import com.designpatterns.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior{

	public void quack() {
		System.out.println("Squeak");
	}

}
