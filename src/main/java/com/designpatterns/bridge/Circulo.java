package com.designpatterns.bridge;

public class Circulo extends AbstractFigura {

	public Circulo(IColor icolor) {
		super(icolor);
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando...");
		icolor.pintar();
	}
}