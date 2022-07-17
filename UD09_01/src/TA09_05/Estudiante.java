package TA09_05;

import java.util.Hashtable;
import java.util.Random;
import javax.swing.JOptionPane;

public class Estudiante extends Persona implements Faltas {
    
    private boolean novillos = Faltas();
    private Materias calificaciones = new Materias();
    
    public Estudiante() {
    	// Constructor por defecto
    	this.nombre = "";
    	this.edad = 0;
    	this.sexo = 'M';
    }
    
    /*
     * Constructor:
     * - Nombre
     * - Edad
     * - Sexo
     */
    public Estudiante(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    /**
	 * @return the novillos
	 */
	public boolean isNovillos() {
		return novillos;
	}

	/* 
     * Método que comprobara si el estudiante esta haciendo novillos o no
     * 50% => SI => false
     * 50% => NO => true
     */
    public boolean Faltas () {
    	
    	// Creamos un booleano aleatorio 50 50
        Random random = new Random();
        boolean novillos = random.nextBoolean();
        
        /* 
         * True = Esta en clase
         * False = No esta en clase
         */
        if (novillos == false) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Método para añadir las notas a los alumnos
     * 
	 * Materias Notas
	 * - materia[0] = matematicas
	 * - materia[1] = filosofia
	 * - materia[2] = fisica
	 * 
	 * Pasaremos un array booleano con un true o false depende si la materia esta disponible para anadir una nota o no
	 */
    public void setNotas (boolean[] materiasDisponibles) {
    	// Declaramos un array con las materias disponibles
    	String[] materiasNombre = {"Mates", "Filosofia", "Fisica"};
    	
    	// Para cada materia cambiaremos su valor de 0.00 a el valor que escogeremos si la materia esta disponible
    	for (int i = 0; i < materiasNombre.length; i++) {
    		if (materiasDisponibles[i] == true) { // Si esta disponible
    			// replace key(nombreMateria), double(nota)
    			this.calificaciones.getMaterias().replace(materiasNombre[i], Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la asignatura" + materiasNombre[i])));
    		}
    	}
    
    }
    
    // Getter de notas
    public Hashtable<String, Double> getNotas() {
    	return this.calificaciones.getMaterias(); // Devuelve un hashtable (nombreNota, nota)
    }

}
