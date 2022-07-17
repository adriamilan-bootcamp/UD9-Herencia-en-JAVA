package TA09_06;

public class Cine {

	/*Atributos*/
	
	private String[][] sala;
	
	private double precioEntrada;

	private Pelicula peliculaReproduciendose;
	
	
	/*Constructores */

	/**
	 * Constuctor de la clase especificando la sala y su precio de entrada.
	 * @param sala
	 * @param precioEntrada
	 */
	public Cine(String[][] sala, double precioEntrada) {
		this.sala = sala;
		this.precioEntrada = precioEntrada;
	}


	/**
	 * Constuctor de la clase especificando la sala ,el precio de entrada y la pelicula que se esta reproduciendo.
	 * @param sala
	 * @param precioEntrada
	 * @param peliculaReproduciendose
	 */
	public Cine(String[][] sala, double precioEntrada, Pelicula peliculaReproduciendose) {
		this.sala = sala;
		this.precioEntrada = precioEntrada;
		this.peliculaReproduciendose = peliculaReproduciendose;
	}

	
	/* Getters y Setters  */
	
	/**
	 * @return the sala
	 */
	public String[][] getSala() {
		return sala;
	}


	/**
	 * @param sala the sala to set
	 */
	public void setSala(String[][] sala) {
		this.sala = sala;
	}
	
	
	/**
	 * @return the precioEntrada
	 */
	public double getPrecioEntrada() {
		return precioEntrada;
	}


	/**
	 * @param precioEntrada the precioEntrada to set
	 */
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	/**
	 * @return the peliculaReproduciendose
	 */
	public Pelicula getPeliculaReproduciendose() {
		return peliculaReproduciendose;
	}


	/**
	 * @param peliculaReproduciendose the peliculaReproduciendose to set
	 */
	public void setPeliculaReproduciendose(Pelicula peliculaReproduciendose) {
		this.peliculaReproduciendose = peliculaReproduciendose;
	}
	
	
	
	public void llenarSala (Espectador espectadores[]) {
		
	}

	
}
