package TA09_01;

public class Electrodomestico {

	/*Valores por defecto */
	private final double precioBaseDefecto = 100;

	private final String colorDefecto = "blanco";

	private final char consumoEnergeticoDefecto = 'F';
	
	private final double pesoDefecto = 5;
	
	/*Atributos de la clase */
	protected double precio = precioBaseDefecto;

	protected String color = colorDefecto;

	protected char consumoEnergetico = consumoEnergeticoDefecto;
	
	protected double peso = pesoDefecto;
	
	/*Valores disponibles en los atributos notas y colores */
	String notasConsumo = "ABCDEF";

	String[] colores = {"blacno","nergo","rojo","azul","gris"};

	
	
	public Electrodomestico() {
	}



	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}



	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		this.peso = peso;
		
		//Comprobación de que el color que ha introducido el usuario esta disponible
		boolean colorAvailable = false;
		
		for (int i = 0; i < colores.length; i++) {
			if(color.equals(colores[i])) {
				colorAvailable = true;
				break;
			}
		}
		 
		if(colorAvailable) { //Si lo esta se le asigna el color sino se quedará con el color por defecto
			this.color = color;
		}
		
		//Comprobación de que el consumo introducido por el usuario existe
		boolean notaAvailable = false;
		for (int i = 0; i < notasConsumo.length(); i++) {
			if(notasConsumo.charAt(i) == consumoEnergetico ) {
				notaAvailable = true;
			}
		}

		if(colorAvailable) {
			this.consumoEnergetico = consumoEnergetico;
		}
	}
	
	
	
	



	
}
