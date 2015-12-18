package com.designpatterns.Adapter;

public class MotorDiesel extends Motor {

	@Override
	public void encender() {
		System.out.println("Encender motor Diesel");
	}

	@Override
	public void apagar() {
		System.out.println("Apagar motor Diesel");
	}

}