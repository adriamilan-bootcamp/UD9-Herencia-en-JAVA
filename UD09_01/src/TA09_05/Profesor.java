package TA09_05;

import TA09_02.Entregable;

public class Profesor extends Persona implements Faltas {
	
	private String materiasDisponibles[] = {"matematicas","filosofia","fisica"};
		
	/*Atributos de la clase */	
	private String materia = "";
	
	private boolean disponible =  true;
	
	public Profesor () {
		
	}
	
	public Profesor(String nombre, int edad, char sexo, String materia , boolean disponible) {
		super(nombre, edad, sexo);
		this.disponible = disponible;

		boolean mDisponible = checkMateria(materia);	
		
		if(mDisponible) {
			this.materia = materia;
		}
		
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
	
	@Override
	public boolean Faltas () {
		boolean disponible = true;
		int random = (int)((Math.random() * ((100) - 0)) + 0);
		
		if( random < 21) {
			disponible = false;
		}
		
		return disponible;
	}
 
}
