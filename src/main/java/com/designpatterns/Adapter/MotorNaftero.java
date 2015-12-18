package com.designpatterns.Adapter;

public class MotorNaftero extends Motor {

	@Override
	public void encender() {
		System.out.println("Encender motor Naftero");
	}

	@Override
	public void apagar() {
		System.out.println("Apagar motor Naftero");
	}

}