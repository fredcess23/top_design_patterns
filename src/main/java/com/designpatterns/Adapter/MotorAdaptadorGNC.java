package com.designpatterns.Adapter;

public class MotorAdaptadorGNC extends Motor {
	
	MotorGNC motorGNC;

	public MotorAdaptadorGNC() {
		this.motorGNC = new MotorGNC();
	}

	@Override
	public void encender() {
		System.out.println("Encender motor GNC");
		this.motorGNC.calentar();
	}

	@Override
	public void apagar() {
		System.out.println("Apagar motor GNC");
		this.motorGNC.parar();
	}

}