package com.designpatterns.facade;

public class Impresora {

	private String nombre;
	private String tipoHoja;
	private String texto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoHoja() {
		return tipoHoja;
	}

	public void setTipoHoja(String tipoHoja) {
		this.tipoHoja = tipoHoja;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}