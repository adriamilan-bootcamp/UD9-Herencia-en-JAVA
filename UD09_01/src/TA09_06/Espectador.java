package TA09_06;

public class Espectador {

	/* Atributos de la clase */
	private String nombre;
	private int edad;
	private double dinero;
	private boolean enSala = false;
	
	public Espectador() {
		this.enSala = false;
	}
	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.enSala = true;
	}

	// Getters & Setters
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the dinero
	 */
	public double getDinero() {
		return dinero;
	}

	/**
	 * @return the enSala
	 */
	public boolean isEnSala() {
		return enSala;
	}

	/**
	 * @param enSala the enSala to set
	 */
	public void setEnSala(boolean enSala) {
		this.enSala = enSala;
	}

	// Método para saber si el espectador tiene suficiente dinero para ver la película
	public boolean dineroSuficiente(double costoEntrada) {
		
		// Si el dinero que tiene el espectador es mayor o igual al costo de la entrada.
		if(this.dinero >= costoEntrada) {
			return true; // Devuelve true
		} else {
			return false; // Devuelve false
		}
		
	}
	
	// Método para saber si el espectador tiene la edad suficiente para ver la película
	public boolean edadSuficiente(int edadPelicula) {
		
		// Si la edad es igual o mayor a la mínima para ver la película
		if(this.edad >= edadPelicula) {
			return true; // Devuelve true
		} else {
			return false; // Devuelve false
		}
		
	}
	
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
 	
}
