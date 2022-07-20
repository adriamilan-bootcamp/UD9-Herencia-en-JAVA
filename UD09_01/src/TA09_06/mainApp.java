package TA09_06;

public class mainApp {

	public static void main(String[] args) {
		Pelicula c1 = new Pelicula("El regreso del jedi", 120, 12, "Paco");
		Cine cine = new Cine(6.90, c1);
		
		cine.printSala();//se muestra el cine esta vacio
		cine.venderEntradas();//Se venden las entradas a los espectadores
		cine.printSala(); //Se muestra la sala con los espectadores que han conseguido entrar
	}

}
