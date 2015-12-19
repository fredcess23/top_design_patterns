package com.designpatterns.factory;

public abstract class TVBase {

	private String descripcion;
	private String tipoPantalla;
	private String color;

	public String verDescripcion() {
		return "Descripcion: " + this.descripcion + " Tipo de pantalla: " + this.tipoPantalla + " Color: " + color;
	}
	
	//setters and getters

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}