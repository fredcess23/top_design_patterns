package com.designpatterns.factory;

/**
 * 
 * Factory Method: sirve cuando no se puede anticipar el tipo de objeto que debe crear y quiere 
 * que sus subclases especifiquen dichos objetos.
 * 
 * */

public class Cliente {

	public static void main(String[] args) {
		
		TVFactoryMethod tvMethod = new TVFactory();
		TVBase tv = tvMethod.obtenerTV("Negro", "40 pulgadas, 256 M. Colores", "lcd");
		System.out.println(tv.verDescripcion());
	
	}
}
