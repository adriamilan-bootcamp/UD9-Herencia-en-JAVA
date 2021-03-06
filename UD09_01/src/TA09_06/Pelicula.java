package TA09_06;

public class Pelicula {
	
	/*Atributos*/
	private String titulo;
	
	private double duracion;
	
	private int edadMinima;
	
	private String director;


	/*Constructores */
	/**
	 * Constuctor de la clase especificando el titulo , la duraci?n , edad minima y director de la pelicula.
	 * @param titulo
	 * @param duracion
	 * @param edadMinima
	 * @param director
	 */
	public Pelicula(String titulo, double duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	/* Getters y Setters  */
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the edadMinima
	 */
	public int getEdadMinima() {
		return edadMinima;
	}

	/**
	 * @param edadMinima the edadMinima to set
	 */
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
