package com.designpatterns.factory.tv;

public class Plasma extends TVBase {

	public Plasma(String color, String descripcion, String tipoPantalla) {
		super.setColor(color);
		super.setDescripcion(descripcion);
		super.setTipoPantalla(tipoPantalla);
	}
}