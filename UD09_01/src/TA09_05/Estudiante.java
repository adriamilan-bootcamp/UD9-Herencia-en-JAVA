package TA09_05;

import java.util.ArrayList;
import java.util.Random;

public class Estudiante extends Persona implements Faltas {
    
    private ArrayList<Materia> calificaciones = new ArrayList<Materia>();
    private String novillos = Faltas();
    
    public Estudiante() {
        calificaciones.add(new Materia());
    }
    
    public Estudiante(String nombre, int edad, char sexo, String[] materias, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        for (int i = 0; i < materias.length; i++ ) {
            calificaciones.add(new Materia(materias[i], notas[i]));
        }
    }
    
    
    
    /* 
     * Método que comprobara si el estudiante esta haciendo novillos o no
     * 50% => SI => false
     * 50% => NO => true
     */
    public boolean Faltas () {
        Random random = new Random();
        boolean falta = random.nextBoolean();
        
        return falta;
    }

}