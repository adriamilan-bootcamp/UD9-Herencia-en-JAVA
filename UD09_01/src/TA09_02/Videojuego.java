package src.TA09_02;

public class Videojuego implements Entregable {
	
	/* Valores por defecto */
	private final String TITULO_DEF = "Video Juego";
	private final double HORAS_DEF = 10.00;
	private final boolean ENTREGADO_DEF = false;
	private final String GENERO_DEF = "Shooter";
	private final String COMPAÑIA_DEF = "Techmabs";
			
	/*Atributos de la clase */
	protected String titulo = TITULO_DEF;
	protected double horasEstimadas = HORAS_DEF;
	protected boolean entregado = ENTREGADO_DEF;
	protected String genero = GENERO_DEF;
	protected String compañia = COMPAÑIA_DEF;
	
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
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", Horas estimadas=" + horasEstimadas + ", entregado=" + entregado + ", género="
				+ genero + ", compañia=" + compañia + "]";
	}
	
	// Interfaces
	
	/*
	 * Cambia atributo entregado a true.
	 */
	public void entregar() {
		this.entregado = true;
	}
	
	/*
	 * Cambia atributo entregado a false.
	 */
	public void devolver(boolean prestado) {
		this.entregado = false;
	}

	/*
	 * Devuelve el estado del atributo prestado.
	 */
	public boolean isEntregado() {
		return entregado;
	}
 	
}
