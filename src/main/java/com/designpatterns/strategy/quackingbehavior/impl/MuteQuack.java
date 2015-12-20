package com.designpatterns.strategy.quackingbehavior.impl;

import com.designpatterns.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	public void quack() {
		System.out.println("<<Silence>>");
	}

}
