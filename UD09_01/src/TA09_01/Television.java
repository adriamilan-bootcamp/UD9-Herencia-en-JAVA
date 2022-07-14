package TA09_01;

public class Television extends Electrodomestico {
	private int pulgadas = 20;
	private boolean TDT = false;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}


	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(int pulgadas, boolean TDT, double precio ,String color, char consumo, double peso) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.TDT = TDT;
	}
	
	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @return the tDT
	 */
	public boolean isTDT() {
		return TDT;
	}

	
	public double precioFinal() {
		if(this.pulgadas > 40) {
			//Incrementamos el precio un 30%
			precio = (precio * 1.30);
		}
		if(this.TDT == true ) {
			precio += 50;
		}
		return this.precio;
	}
	
	
}
