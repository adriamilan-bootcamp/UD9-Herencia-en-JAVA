package TA09_01;

public class mainApp {

	public static void main(String[] args) {
		
		Electrodomestico nevera2 = new Electrodomestico(300,10);
		Electrodomestico nevera3 = new Electrodomestico(300,"magenta",'A',10);
		nevera3.precioFinal();
		System.out.println("Electrodoméstico1:\n"+nevera2.getPrecio()+"€ "+nevera2.getColor()+" -(Cosnumo) "+nevera2.getConsumoEnergetico()+" - "+nevera2.getPeso()+"kg");
		System.out.println("Electrodoméstico2:\n"+nevera3.getPrecio()+"€ "+nevera3.getColor()+" -(Cosnumo) "+nevera3.getConsumoEnergetico()+" - "+nevera3.getPeso()+"kg");

		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(200,9);		
		Lavadora lavadora3 = new Lavadora(6,200,"Gris",'B',10);	
		
//		lavadora2.precioFinal();

		System.out.println("Lavadora1:\n"+lavadora1.getPrecio()+"€ "+lavadora1.getColor()+" -(Cosnumo) "+lavadora1.getConsumoEnergetico()+" - "+lavadora1.getPeso()+"kg -(Carga)"+lavadora1.getCarga());
		System.out.println("Lavadora2:\n"+lavadora2.getPrecio()+"€ "+lavadora2.getColor()+" -(Cosnumo) "+lavadora2.getConsumoEnergetico()+" - "+lavadora2.getPeso()+"kg -(Carga)"+lavadora2.getCarga());
		System.out.println("Lavadora3:\n"+lavadora3.getPrecio()+"€ "+lavadora3.getColor()+" -(Cosnumo) "+lavadora3.getConsumoEnergetico()+" - "+lavadora3.getPeso()+"kg -(Carga)"+lavadora3.getCarga());
		
	}

}
