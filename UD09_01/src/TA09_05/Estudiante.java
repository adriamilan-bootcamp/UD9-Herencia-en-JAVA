package TA09_05;

import java.util.Hashtable;
import java.util.Random;

public class Estudiante extends Persona {
    
    private Hashtable<String, Double> calificaciones = new Hashtable<>();
    private String novillos = faltasChecker();
    
    public Estudiante() {
    
    }
    
    public Estudiante(String nombre, int edad, char sexo, String[][] materiasNotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        for (int i = 0; i < materiasNotas.length; i++ ) {
        	añadirNotaMateria(materiasNotas[i][0],Double.parseDouble(materiasNotas[i][1]));
        }
    }
    
    
    /* 
     * Método que comprobara si el estudiante esta haciendo novillos o no
     * 50% => SI => false
     * 50% => NO => true
     */
    public String faltasChecker () {
        Random random = new Random();
        boolean novillos = random.nextBoolean();
        
        if (novillos == false) {
            return "en classe";
        } else {
            return "haciendo novillos";
        }
    }
    
    
    public void añadirNotaMateria (String materia, double nota) {
    	this.calificaciones.put(materia, nota);
    }

}
