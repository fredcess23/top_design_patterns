package com.designpatterns.factory.tv;

public class Led extends TVBase {

	public Led(String color, String descripcion, String tipoPantalla) {
		super.setColor(color);
		super.setDescripcion(descripcion);
		super.setTipoPantalla(tipoPantalla);
	}
}