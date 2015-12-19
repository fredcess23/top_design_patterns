package com.designpatterns.bridge;

/**
 * El patrón de diseño bridge nos permite separar abstracción de su implementación.
 * */

public class BridgeMain {

	public static void main(String[] args) {

		AbstractFigura af = new Circulo(new Negro());
		af.dibujar();
		af.icolor = new Rojo();
		af.dibujar();
	}
}