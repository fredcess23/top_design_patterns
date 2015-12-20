package com.designpatterns.strategy;

import com.designpatterns.strategy.behavior.FlyBehavior;
import com.designpatterns.strategy.behavior.QuackBehavior;

/**
 *  The strategy pattern allows you to change the implementation of something used at runtime.
     Change behavior at runtime!
 * */


public abstract class Duck {
	
	//behavior variables/references
	//Composition !
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys !");
	}
	
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
}
