package com.designpatterns.decorator2;

/**
 * <p>
 * Guerrero de Aruqeria con los metodos ya implementados
 * </p>
 */
public class Arquero extends GuerroAbstracto {

	@Override
	public int getDaño() {
		return 5;
	}

	@Override
	public String getArmas() {
		return "Arco";
	}
}