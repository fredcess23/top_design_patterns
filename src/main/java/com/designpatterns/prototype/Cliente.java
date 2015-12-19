package com.designpatterns.prototype;

/**
 * 	#Sirve para generar clones de objetos.
 * 
 * 	El patrón de diseño Prototype sirve para crear clonaciones de objetos (instancias de clases) a 
 * 	fin de no acarrear todo lo que lleva la creación del mismo desde cero, parámetros, métodos a 
 * 	ejecutar, etc. 
 *
 *	Hay que tener en cuenta que clonar un objeto es mucho mas rápido que crearlo.
 *
 */

public class Cliente {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bicicleta bc = new BicicletaModificada();
		bc.setColor("Roja");
		bc.setRodado("22");
		System.out.println(bc.verBicleta());

		Bicicleta bc2 = bc.clone();
		bc2.setColor("Negro");
		bc2.setRodado("30");

		System.out.println(bc2.verBicleta());

	}
}