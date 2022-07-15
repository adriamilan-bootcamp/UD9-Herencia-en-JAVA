package TA09_05;

public class Aula {
	private int nEstadiantesMax = 25;

	private boolean disponible = false;
	
	private Profesor profesor;
	
	private Materia materia;
		
	private Estudiante estudiantes[];
		
	
	public Aula(boolean disponible, Materia materia, Profesor profesor, Estudiante estudiantes[]) {
		this.disponible = disponible;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes; 
	}
	
	/**
	 * @return the nEstadiantesMax
	 */
	public int getnEstadiantesMax() {
		return nEstadiantesMax;
	}

	/**
	 * @param nEstadiantesMax the nEstadiantesMax to set
	 */
	public void setnEstadiantesMax(int nEstadiantesMax) {
		this.nEstadiantesMax = nEstadiantesMax;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}

	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
	 * @return the estudiantes
	 */
	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}


	/**
     * Método que comprueba si el numero de alumnos en el aula es superior o igual a la mitad de su capacidad de estudiantes, si es superior se podrá hacer clase, sino no.
     * @return el resultado de la comprobación
    */
	public boolean comprobarClase() {
		if((int)(this.nEstadiantesMax/2) >= estudiantes.length) {
			return true;
		}
		return false;
	}






	
	
}
