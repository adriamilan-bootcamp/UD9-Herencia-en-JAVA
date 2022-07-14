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

	String[] colores = {"blanco","negro","rojo","azul","gris"};

	
	
	public Electrodomestico() {
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}


	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		this.peso = peso;
		
		//Comprueba el color introducido por el usuario sin importar si ha utilizado mayúsculas o minúsculas al introducirlo
		comprobarColor(color.toLowerCase()); 
				
		comprobarConsumoEnergetico(consumoEnergetico);	
	}


	public double getPrecio() {
		return precio;
	}



	public String getColor() {
		return color;
	}



	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}



	public double getPeso() {
		return peso;
	}
	
	/**
     * Método que comprueba si la nota de consumo introducido por el usuario existe
     * @param letra nota de consumo introducida
     */
	public void comprobarConsumoEnergetico(char letra) {
		boolean notaAvailable = false;
		
		for (int i = 0; i < notasConsumo.length(); i++) {
			if(notasConsumo.charAt(i) == letra ) {
				notaAvailable = true;
			}
		}
		

		if(notaAvailable) {
			this.consumoEnergetico = letra;
		}
	}
	
	/**
     * Método que comprueba que el color que ha introducido el usuario esta disponible
     * @param color color introducido por el usuario
     */
	public void comprobarColor(String color) {
		
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
		
	}

	/**
     * Suma al precio final según el peso y el consumo del artículo 
     */
	public void precioFinal () {
				
		if (this.peso >= 0 && this.peso <= 19) {
			this.precio  += 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			this.precio += 50;			
		}else if(this.peso >= 50 && this.peso <= 79) {
			this.precio += 80;			
		}else {
			this.precio += 100;			
		}
		
		switch(this.consumoEnergetico) {
			case 'A':
				this.precio += 100;	
			break;
			case 'B':
				this.precio += 80;	
			break;
			case 'C':
				this.precio += 60;	
			break;
			case 'D':
				this.precio += 50;	
			break;
			case 'E':
				this.precio += 30;	
			break;
			case 'F': 
				this.precio += 10;	
			break;
		}
		
	
	}
	
	



	
}
