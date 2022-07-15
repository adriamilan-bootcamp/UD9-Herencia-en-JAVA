package TA09_05;

import TA09_02.Entregable;

public class Profesor extends Persona implements Faltas {		
	/*Atributos de la clase */	
	private Materia materia;
	
	private boolean disponible =  true;
	
	public Profesor (String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);		
	}
	
	public Profesor(String nombre, int edad, char sexo, Materia materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
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
