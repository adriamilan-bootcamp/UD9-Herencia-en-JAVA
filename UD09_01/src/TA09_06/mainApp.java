package TA09_06;

public class mainApp {

	public static void main(String[] args) {
		Pelicula c1 = new Pelicula("El regreso del jedi", 120, 12, "Paco");
		Cine cine = new Cine(6.90, c1);
		//Ahora el cine esta vacio
		cine.printSala();
		cine.venderEntradas();
		cine.printSala();
	}

}
