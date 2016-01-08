package com.designpatterns.factory.tv;

/**
 * La magia del Patrón Factory Method, pasa por aqui, el metodo obtenerObject, va determinar de acuerdo a 
 * los datos de entrada que ClaseEspecializada va a utilizar.
 * 
 * */

public class TVFactory implements TVFactoryMethod {

	public TVBase obtenerTV(String color, String descripcion, String tipoPantalla) {

		if (tipoPantalla == "lcd") {
			return new LCD(color, descripcion, tipoPantalla);
			
		} else if (tipoPantalla == "plasma") {
			return new Plasma(color, descripcion, tipoPantalla);
		
		} else if (tipoPantalla == "led") {
			return new Led(color, descripcion, tipoPantalla);
		}
		
		return null;
	}

}