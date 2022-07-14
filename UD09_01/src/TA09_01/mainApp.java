package TA09_01;

public class mainApp {

	public static void main(String[] args) {
		
		Electrodomestico nevera1 = new Electrodomestico();
		Electrodomestico nevera2 = new Electrodomestico(300,10);
		Electrodomestico nevera3 = new Electrodomestico(300,"magenta",'A',10);
		
		nevera3.precioFinal();

		System.out.println("Electrodoméstico1:\n"+nevera1.getPrecio()+"€ "+nevera1.getColor()+" -(Cosnumo) "+nevera1.getConsumoEnergetico()+" - "+nevera1.getPeso()+"kg");
		System.out.println("Electrodoméstico2:\n"+nevera2.getPrecio()+"€ "+nevera2.getColor()+" -(Cosnumo) "+nevera2.getConsumoEnergetico()+" - "+nevera2.getPeso()+"kg");
		System.out.println("Electrodoméstico3:\n"+nevera3.getPrecio()+"€ "+nevera3.getColor()+" -(Cosnumo) "+nevera3.getConsumoEnergetico()+" - "+nevera3.getPeso()+"kg");

		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(200,9);		
		Lavadora lavadora3 = new Lavadora(31,200,"Gris",'B',10);	
		
		lavadora2.precioFinal();
		lavadora3.precioFinal();

		System.out.println("\nLavadora1:\n"+lavadora1.getPrecio()+"€ "+lavadora1.getColor()+" -(Cosnumo) "+lavadora1.getConsumoEnergetico()+" - "+lavadora1.getPeso()+"kg -(Carga)"+lavadora1.getCarga());
		System.out.println("Lavadora2:\n"+lavadora2.getPrecio()+"€ "+lavadora2.getColor()+" -(Cosnumo) "+lavadora2.getConsumoEnergetico()+" - "+lavadora2.getPeso()+"kg -(Carga)"+lavadora2.getCarga());
		System.out.println("Lavadora3:\n"+lavadora3.getPrecio()+"€ "+lavadora3.getColor()+" -(Cosnumo) "+lavadora3.getConsumoEnergetico()+" - "+lavadora3.getPeso()+"kg -(Carga)"+lavadora3.getCarga());
		
		Television television1 = new Television();
		Television television2 = new Television(599,6);
		Television television3 = new Television(65,false,1199,"Rojo",'A',10);
		
		television1.precioFinal();
		television2.precioFinal();
		television3.precioFinal();

		
		System.out.println("\nTelevision1:\n"+television1.getPrecio()+"€ "+television1.getColor()+" -(Cosnumo) "+television1.getConsumoEnergetico()+" - "+television1.getPeso()+"kg -(Pulgadas) "+television1.getPulgadas());
		System.out.println("Television2:\n"+television2.getPrecio()+"€ "+television2.getColor()+" -(Cosnumo) "+television2.getConsumoEnergetico()+" - "+television2.getPeso()+"kg -(Pulgadas) "+television2.getPulgadas());
		System.out.println("Television3:\n"+television3.getPrecio()+"€ "+television3.getColor()+" -(Cosnumo) "+television3.getConsumoEnergetico()+" - "+television3.getPeso()+"kg -(Pulgadas) "+television3.getPulgadas());

		
		
	}

}
