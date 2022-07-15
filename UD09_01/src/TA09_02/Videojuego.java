package TA09_02;

import java.nio.charset.StandardCharsets;

public class Videojuego implements Entregable {
	
	/* Valores por defecto */
	private final String TITULO_DEF = "Video Juego";
	private final double HORAS_DEF = 10.00;
	private final boolean ENTREGADO_DEF = false;
	private final String GENERO_DEF = "Shooter";
	private final String COMPANIA_DEF = "Techmabs";
			
	/*Atributos de la clase */
	protected String titulo = TITULO_DEF;
	protected double horasEstimadas = HORAS_DEF;
	protected boolean entregado = ENTREGADO_DEF;
	protected String genero = GENERO_DEF;
	protected String compania = COMPANIA_DEF;
	
	public Videojuego() {
		// Constructor por defecto
	}
	
	/*
	 * Constructor:
	 * - Titulo
	 * - Horas Estimadas
	 */
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	/*
	 * Constructor:
	 * - Titulo
	 * - Horas Estimadas
	 * - Género
	 * - Compañia
	 */
	public Videojuego(String titulo, double horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	// Getters & Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	@Override
	public String toString() {
		String message = "Videojuego [titulo=" + titulo + ", Horas estimadas=" + horasEstimadas + ", entregado=" + entregado + ", género=" + genero + ", compañia=" + compania + "]";
		String asciiMessage = new String(message.getBytes(), StandardCharsets.UTF_8);
		return asciiMessage;
	}
	
	// Interfaces
	
	/*
	 * Cambia atributo entregado a true.
	 */
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	/*
	 * Cambia atributo entregado a false.
	 */
	@Override
	public void devolver() {
		this.entregado = false;
	}

	/*
	 * Devuelve el estado del atributo prestado.
	 */
	@Override
	public boolean isEntregado() {
		return entregado;
	}
 	
}
