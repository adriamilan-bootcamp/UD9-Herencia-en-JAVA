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
		this.nEstadiantesMax = estudiantes.length+1;
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
     * M�todo que comprueba si el numero de alumnos en el aula es superior o igual a la mitad de su capacidad de estudiantes, si es superior se podr� hacer clase, sino no y
     * si la materia del aula es la misma que imparte el profesor del aula.
     * @return el resultado de la comprobaci�n
    */
	public boolean comprobarClase() {
		
		if(!profesor.Faltas()) {
			return false;
		}
		
		int c = 0;
		for (int i = 0; i < estudiantes.length; i++) {
			if(estudiantes[i].isNovillos()) {
				c++;
			}
		}
		
		if((int)(this.nEstadiantesMax/2) >= c && this.profesor.getMateria().equals(this.materia)) {
			return true;
		}
		return false;
	}






	
	
}
