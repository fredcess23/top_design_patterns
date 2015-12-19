package com.designpatterns.prototype;

public class BicicletaModificada extends Bicicleta {

	@Override
	public String verBicleta() {

		return "Este es el color: " + this.getColor() + " El rodado es: " + this.getRodado();
	}

}