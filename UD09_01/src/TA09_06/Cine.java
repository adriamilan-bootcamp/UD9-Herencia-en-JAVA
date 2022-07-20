package TA09_06;

import java.util.Random;

import javax.swing.JOptionPane;

public class Cine {

	/*Atributos*/
	
	private Espectador[][] sala = new Espectador[8][9];
	
	private double precioEntrada;

	private Pelicula peliculaReproduciendose;
	
	
	/*Constructores */

	/**
	 * Constuctor de la clase especificando la sala y su precio de entrada.
	 * @param sala
	 * @param precioEntrada
	 */
	public Cine(double precioEntrada) {
		genSala();
		this.precioEntrada = precioEntrada;
	}


	/**
	 * Constuctor de la clase especificando la sala ,el precio de entrada y la pelicula que se esta reproduciendo.
	 * @param sala
	 * @param precioEntrada
	 * @param peliculaReproduciendose
	 */
	public Cine(double precioEntrada, Pelicula peliculaReproduciendose) {
		genSala();
		this.precioEntrada = precioEntrada;
		this.peliculaReproduciendose = peliculaReproduciendose;
	}

	public void genSala() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				sala[i][j] = new Espectador();
			}
		}
	}
	
	public void venderEntradas() {
		int n ,x ,y;
		
		do {
			n = Integer.parseInt( JOptionPane.showInputDialog("Introduce el numero de espectadores:") );
		} while (n > 72);
		
		for (int i = 0; i < n; i++) {
			Random r = new Random();
			do {
				x = r.nextInt(8); 
				y = r.nextInt(9); 
				if(!sala[x][y].isEnSala()) {
					int edad = r.nextInt(99)+1;
					int dinero = r.nextInt(30)+1;
					sala[x][y].setDinero(dinero) ;
					sala[x][y].setEdad(edad);
						if(sala[x][y].dineroSuficiente(this.precioEntrada) && sala[x][y].edadSuficiente(this.peliculaReproduciendose.getEdadMinima())) {
						sala[x][y].setEnSala(true);
					}					
				}
			} while (!sala[x][y].isEnSala());
		}
	}
	
	public void printSala() {
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				//JOptionPane.showMessageDialog(null, "");
				System.out.print( sala[i][j].isEnSala()+"	" );
			}
			System.out.println();
		}
	}
	
	
	/* Getters y Setters  */
	
	/**
	 * @return the sala
	 */
	public Espectador[][] getSala() {
		return sala;
	}


	/**
	 * @param sala the sala to set
	 */
	public void setSala(Espectador[][] sala) {
		this.sala = sala;
	}
	
	
	/**
	 * @return the precioEntrada
	 */
	public double getPrecioEntrada() {
		return precioEntrada;
	}


	/**
	 * @param precioEntrada the precioEntrada to set
	 */
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	/**
	 * @return the peliculaReproduciendose
	 */
	public Pelicula getPeliculaReproduciendose() {
		return peliculaReproduciendose;
	}


	/**
	 * @param peliculaReproduciendose the peliculaReproduciendose to set
	 */
	public void setPeliculaReproduciendose(Pelicula peliculaReproduciendose) {
		this.peliculaReproduciendose = peliculaReproduciendose;
	}

	
}
