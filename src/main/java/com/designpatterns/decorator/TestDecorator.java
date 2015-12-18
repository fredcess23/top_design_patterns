package com.designpatterns.decorator;

public class TestDecorator {

	/**
	 * 
	 * El Patrón Decorator  es un patrón que permite agregar funcionalidades y
	 * responsabilidades a objetos de forma dinámica y transparente para el usuario, 
	 *  proporcionando una alternativa flexible a la herencia para extender funcionalidad.
	 * 
	 */
	public static void main(String[] args) {

		GuerroAbstracto infanteria = new Infanteria();
		infanteria = new Madera(infanteria); //Agrega funcionalidad
		infanteria = new Fuego(infanteria); //Agrega funcionalidad

		System.out.println(infanteria.getArmas());
		System.out.println(infanteria.getDaño());
	}

}