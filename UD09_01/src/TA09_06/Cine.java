package TA09_06;

import java.util.Random;
import java.util.Scanner;

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

	/**
	 * Metodo que genera una sala "vacia".
	 */
	public void genSala() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				sala[i][j] = new Espectador();
			}
		}
	}
	
	/**
	 * Metodo en el que se introducen el numero de espectadores que quieren entrar al cine y se les deniega o concede el acceso para que entren y se sientan en la sala a ver la pelicula.
	 */
	public void venderEntradas() {
        Scanner sc = new Scanner(System.in);
		int n ,x ,y;
		
		int capacidadSala = sala.length*sala[1].length;
		
		do {
			System.out.print("\nIntroduce el numero de espectadores: ");
			n = sc.nextInt();
			
			if(n > capacidadSala) {
				System.out.println("\nEstas introduciendo más espectadores de los que pueden entrar a la sala (max "+capacidadSala+" espectadores)");
			}
			
		} while (n > capacidadSala);
		
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

	/**
	 * Metodo que muestra las butacas de una sala y si estan ocupadas por un espectador o no.
	 */
	public void printSala() {
		String letrasColumas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int numEspectadores = 0;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("[Butacas de la Sala para ver "+peliculaReproduciendose.getTitulo()+"]\n(No ocupadas x , ocupadas o)\n");
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				System.out.print("["+(sala.length-i)+""+letrasColumas.charAt(j)+"] ");
				if( sala[i][j].isEnSala()) {
					System.out.print("o ");
					numEspectadores++;
				}else {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		
		if(numEspectadores != 0) {
			System.out.println("\nHan entrado a ver la pelicula "+numEspectadores+" espectadores!");
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
