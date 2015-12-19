package com.designpatterns.bridge;

/**
 * 
 * La magia de Bridge es que la clase abstracta posee una propiedad del tipo IColor, 
 * lo cual cualquier clase que implemente de ella va a ser posible utilizar sus métodos.
 * */

public abstract class AbstractFigura {

	protected IColor icolor;

	public AbstractFigura(IColor icolor) {
		this.icolor = icolor;
	}

	public abstract void dibujar();
}