package TA09_04;

import java.lang.FdLibm.Pow;

public class Raices {
	private double a, b, c;
	
	public Raices() {
		// TODO Auto-generated constructor stub
	}

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		return (Math.pow(this.b, 2))-4*this.a*this.c;
	}
	
	public boolean tieneRaices() {
		if(getDiscriminante() >= 0) {
			return true;
		}
		return false;
	}
	
	public boolean tieneRaiz() {
		if(getDiscriminante() == 0) {
			return true;
		}
		return false;
	}
	
	public void calcular () {
		if (getDiscriminante() >= 0) {
	        double soluciones[];
	        // Una solucion
	        if(getDiscriminante() == 0){
	        	System.out.println("Solucion Unica:" + ((-b) - (4 * a * c)) / (2 * a));
	        // Dos soluciones
	        }else{
	        	System.out.println("Solucion 1:" + ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	        	System.out.println("Solucion 2:" + ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	        }
	    } else {
	        // Sin solucion
        	System.out.println("Sin solucion");
	    }
		
		
		
	}
}
