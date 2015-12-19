package com.designpatterns.factory;

public interface TVFactoryMethod {

	public TVBase obtenerTV(String color, String descripcion, String tipoPantalla);

}