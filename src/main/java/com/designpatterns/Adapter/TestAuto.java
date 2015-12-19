package com.designpatterns.adapter;

/*
 * El patrón de diseño Adapter establece una capa intermedia que permita comunicarse a 
 * dos clases que de otro modo no podrían hacerlo, realizando una adaptación de la interfaz 
 * de la clase que proporciona el servicio a la que la solicita.
 *
 *Sirve como intermediario entre dos clases, convirtiendo las interfases de una clase que 
 *pueda ser utilizada por otra.
 * 
 * */

public class TestAuto {

	public static void main(String[] args) {
		
		// Motor Diesel
		Motor motorDiesel = new MotorDiesel();
		motorDiesel.encender();
		motorDiesel.apagar();

		// Motor Naftero
		Motor motorNaftero = new MotorNaftero();
		motorNaftero.encender();
		motorNaftero.apagar();

		// Motor GNC
		Motor motorAdaptadorGNC = new MotorAdaptadorGNC();
		motorAdaptadorGNC.encender();
		motorAdaptadorGNC.apagar();
	}
}