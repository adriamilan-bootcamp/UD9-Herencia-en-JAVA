package TA09_05;

public class Aula {
	private boolean disponible = false;
	private String materia = "";
	private int nAlumnosMax = 25;
	
	public Aula() {
		// TODO Auto-generated constructor stub
	}

	
	//SE puede hacer clase si el numero de alumnos en el aula es superior o igual a la mitad de la capacidad de la clase
	public boolean comprobarClase(int nAlumnos) {
		if((int)(this.nAlumnosMax/2) >= nAlumnos) {
			return true;
		}
		return false;
	}


	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}


	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}


	/**
	 * @return the nAlumnosMax
	 */
	public int getnAlumnosMax() {
		return nAlumnosMax;
	}


	/**
	 * @param nAlumnosMax the nAlumnosMax to set
	 */
	public void setnAlumnosMax(int nAlumnosMax) {
		this.nAlumnosMax = nAlumnosMax;
	}
	
	
}
