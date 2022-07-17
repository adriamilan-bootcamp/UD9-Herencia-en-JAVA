package TA09_05;

import java.util.Hashtable;

public class Materias {
    
	/*
	 * Atributo por defecto (materias)
	 * - Materia 1 = Mates
     * - Materia 2 = Filosofia
     * - Materia 3 = Fisica
	 */
	private Hashtable<String, Double> materias = new Hashtable<>();
	
    public Materias() {
    	// Constructor por defecto
    	materias.put("Mates", 0.00);
    	materias.put("Filosofia", 0.00);
    	materias.put("Fisica", 0.00);
    }	

    // Getters & Setters
    
    /**
	 * @return the materias
	 */
	public Hashtable<String, Double> getMaterias() {
		return this.materias;
	}
        
}