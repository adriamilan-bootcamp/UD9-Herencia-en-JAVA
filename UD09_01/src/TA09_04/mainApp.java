package TA09_04;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {

		inputOutput();
		
	}

	public static void inputOutput() {
		
		// Pedimos al usuario la cantidad de calculos que quiere realizar
		int numeroCalculos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de caluclos que quieres realizar."));
		
		// Creamos cada objeto y mostramos los calculos realizados.
		for (int i = 0; i < numeroCalculos; i++) {
			/*
			 *  Creamos el objeto
			 *  - Coeficiente a
			 *  - Coeficiente b
			 *  - Coeficiente c
			 */
			Raices raiz = new Raices(Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer coeficiente.")), Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo coeficiente.")), Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer coeficiente.")));
			
			// Mostramos los calculos
			raiz.calcular();
		}
		
	}
	
}
