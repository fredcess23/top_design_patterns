package com.designpatterns.factory.tv;

public interface TVFactoryMethod {

	public TVBase obtenerTV(String color, String descripcion, String tipoPantalla);

}