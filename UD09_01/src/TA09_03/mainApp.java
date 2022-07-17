package TA09_03;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		
		// Ejemplos de prueba para el ejercicio
		librosPrueba();
		
		// Contacto con el usuario
		inputOutput();
		
	}
	
	/**
     * Metodo en el que introduces la cantidad de libros y las caracteristicas de estos , muestra esas caracteristicas y llama a tieneMasPaginas()
    */
	public static void inputOutput() {
		
		// Pedimos al usuario la cantidad de libros que quiere introducir
		int numLibros =Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de libros que quieres introducir."));
		// Creamos un array de libros 
		Libro libros[] = new Libro[numLibros];
		
		for (int i = 0; i < numLibros; i++) {
			// Creamos un nuevo libro
			libros[i] = new Libro(JOptionPane.showInputDialog("Introduce el ISBN del libro"), JOptionPane.showInputDialog("Introduce el nombre del libro."), JOptionPane.showInputDialog("Introduce el nombre del autor."), Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de paginas que tiene el libro.")));
			
			// Mostramos las caracteristicas del Libro
			JOptionPane.showMessageDialog(null, libros[i].toString());
		}
		
		// Mostramos el libro con más páginas
		Libro libroConMasPaginas = tieneMasPaginas(libros);
		JOptionPane.showMessageDialog(null, "El libro " + libroConMasPaginas.getTitulo() + " es el libro con mas paginas, con un total de " + libroConMasPaginas.getnPaginas());		
		
	}
	

	/**
     * Metodo para para ver que libro tiene mas paginas
    */
	public static Libro tieneMasPaginas(Libro[] libros) {
		
		Libro mayor = libros[0];
		
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getnPaginas() > mayor.getnPaginas()) {
				mayor = libros[i];
			}
		}
		
		return mayor;
		
	}
	
	/**
     * Metodo de prueba
    */
	public static void librosPrueba() {
		
		Libro libros[] = new Libro[2];
		
		// Creamos unos libros para el ejemplo
		libros[0] = new Libro("18953", "Principios de Java", "ZeroDev", 666);
		libros[1] = new Libro("18958", "Principios de PHP", "ZeroDev", 333);
		
		// Mostramos por pantalla los libros de ejemplo
		System.out.println(libros[0].toString());
		System.out.println(libros[1].toString());
		
		// Mostramos el libro con mas paginas
		Libro libroConMasPaginas = tieneMasPaginas(libros);
		JOptionPane.showMessageDialog(null, "El libro " + libroConMasPaginas.getTitulo() + " es el libro con mas paginas, con un total de " + libroConMasPaginas.getnPaginas());
		
	}

}
