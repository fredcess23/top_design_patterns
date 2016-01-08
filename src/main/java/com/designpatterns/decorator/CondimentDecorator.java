package com.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {
	
	protected Beverage beverage; //the component the decorator wraps
	public abstract String getDescription();
}