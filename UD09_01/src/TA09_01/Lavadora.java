package TA09_01;

public class Lavadora extends Electrodomestico {

	final double CARGA_DEF = 5.00;
	
	private double carga;
	
	/*
	 * Constructor por defecto
	 */
	public Lavadora() {
		this.carga = CARGA_DEF;
	}

	/*
	 * Constructor:
	 * - precio
	 * - peso
	 */
	public Lavadora(double precio, double peso) {
		super.precio = precioFinal(precio, this.carga);
		super.peso = peso;
	}
	
	/*
	 * Constructor:
	 * - Carga
	 * - => Heredado
	 */
	public Lavadora(double carga) {
		this.carga = carga;
	}

	// Getter => carga
	public double getCarga() {
		return carga;
	}
	
	/*
	 * Si carga > 30kg aumentara 50€ el precio
	 */
	public double precioFinal(double precio, double carga) {
		if(carga > 30) /* Si carga es mayor a 30 */ {
			precio += 50; // Sumamos 50 al precio
		}
		return precio; // Devolvemos el precio
	}
	
}
