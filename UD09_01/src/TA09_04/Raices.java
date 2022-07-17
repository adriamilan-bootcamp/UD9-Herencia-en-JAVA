package TA09_04;

public class Raices {
	
	/*Atributos*/
	private double a, b, c;
	
	/*Constructor */
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}	

	/**
     * Metodo que calcula el valor discriminante
     * @return el valor discriminante
    */	
	public double getDiscriminante() {
		return ((Math.pow(this.b, 2))-4)*this.a*this.c;
	}
	
	/**
     * Metodo que llama a getDiscriminante() para averiguar si la raiz tiene 2 soluciones
     * @return booleano que indica si tiene 2 soluciones
    */	
	public boolean tieneRaices() {
		if(getDiscriminante() >= 0) {
			return true;
		}
		return false;
	}

	/**
     * Metodo que llama a getDiscriminante() para averiguar si tiene
     * @return booleano que indica si tiene 2 soluciones
    */	
	public boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		}
		return false;
	}
	
	/**
     * Metodo que averigua y muestra si la raiz tiene 1 , 2 o ninguna solucion
    */	
	public void calcular () {
		
		if (tieneRaices()) {  // Dos soluciones        
        	obtenerRaices();
		}else if(tieneRaiz()){// Una solucion
	        	obtenerRaiz();     
	    } else { // Sin solucion       
        	System.out.println("Sin solucion");
	    }	
	}

	/**
     * Metodo que muestra las 2 soluciones de la raiz
    */	
	public void obtenerRaices () {
		System.out.println("Solucion 1: " + ((this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a));
	    System.out.println("Solucion 2: " + ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a));
	}

	/**
     * Metodo que muestra la solucion de la raiz
    */	
	public void obtenerRaiz () {
		System.out.println("Solucion Unica: " + ((-this.b) - (4 * this.a * this.c)) / (2 * this.a));
	}
	
}
