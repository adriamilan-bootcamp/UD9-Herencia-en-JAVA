package TA09_05;

public class Profesor extends Persona{
	
	private String materiasDisponibles[] = {"matematicas","filosofia","fisica"};
	
	private int maxFaltas = 20;
	
	/*Atributos de la clase */	
	private String materia = "";
	
	private boolean disponible =  true;
	
	private int porcentageFaltas = 0;
	
	public Profesor(String nombre, int edad, char sexo, String materia , boolean disponible , int porcentageFaltas) {
		super(nombre, edad, sexo);
		this.disponible = disponible;

		boolean mDisponible = checkMateria(materia);	
		
		if(mDisponible) {
			this.materia = materia;
		}
		
		this.porcentageFaltas = porcentageFaltas;
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
     * Método que comprueba si la materia introducida por el usuario esta disponible o no 
     * @param materia materia introducida
     * @return un boolean indicando si la materia esta disponible
    */
	public boolean checkMateria(String materia) {
		boolean mDisponible = false;
		
		for (int i = 0; i < materiasDisponibles.length; i++) {
			if(materiasDisponibles[i].equals(materia)) {
				mDisponible = true;
			}
		}
		
		return mDisponible;
	}
	
//	public checkFaltas

}
