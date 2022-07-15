package TA09_05;

public class Materia {
    
    private final String NOMBRE_DEF = "TechMabs";
    private final double NOTA_DEF = 0.00;
    
    private String nombre = NOMBRE_DEF;
    private double nota = NOTA_DEF;
    
    public Materia() {
        
    }
    
    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
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
    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }
    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
        
}