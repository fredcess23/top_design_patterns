package com.designpatterns.facade;

/**
 * -Facade proporciona una interfaz simplificada para un grupo de subsistemas o un sistema complejo.
 * 
 * - Simplifica el acceso a un conjunto de clases proporcionando una única clase que todos utilizan 
 * para comunicarse con dicho conjunto de clases.
 * 
 * - Reduce la complejidad y minimiza dependencias
 * 
 * - Define una interfaz de alto nivel que hace que el subsistema sea mas fácil de usar.
 * */


public class Cliente {

	public static void main(String[] args) {

		FacadeCentral facadeCentral = new FacadeCentral();
		facadeCentral.imprimir("Texto a imprimir");
	}

}