package com.designpatterns.facade;

public class FacadeCentral {

	private Impresora impresora;

	public void imprimir(String texto) {
		
		impresora = new Impresora();
		impresora.setNombre("NICO-Printer");
		impresora.setTipoHoja("A4");
		impresora.setTexto(texto);
	
	}

}
