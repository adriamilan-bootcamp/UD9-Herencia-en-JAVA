package src.TA09_02;

public interface Entregable {
	
	/*
	 * Cambia atributo entregado a true.
	 */
	public void entregar();
	
	/*
	 * Cambia atributo entregado a false.
	 */
	public void devolver();
	
	/*
	 * Devuelve el estado del atributo prestado.
	 */
	public boolean isEntregado();
	
}
