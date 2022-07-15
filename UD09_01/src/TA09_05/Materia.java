package TA09_05;

public class Materia {
    
    private final String MATERIAS_DISPONIBLES[] = {"matematicas","filosofia","fisica"};
    
    private String nombre = MATERIAS_DISPONIBLES[0];
    
    public Materia() {
        
    }
    
    public Materia(String nombre) {
        this.nombre = nombre;
    }
    
    // Getters & Setters
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}