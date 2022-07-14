package TA09_01;

import java.text.DecimalFormat;

import TA09_02.Serie;

public class mainApp {

	public static void main(String[] args) {
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		
		electrodomesticos[0] = new Lavadora(31,200,"Gris",'B',7);
		electrodomesticos[1] = new Lavadora(22,400,"magenta",'X',7);	
		electrodomesticos[2] =new Lavadora(33,199,"Azul",'D',10);	
		electrodomesticos[3] = new Lavadora(20,149,"rojo",'E',6);	
		electrodomesticos[4] = new Lavadora(50,599,"negro",'A',10);	
		electrodomesticos[5] = new Television(65,true,1199,"Rojo",'A',6);	
		electrodomesticos[6] = new Television(55,true,899,"blacno",'A',5);		
		electrodomesticos[7] = new Television(45,false,599,"negro",'B',4);	
		electrodomesticos[8] = new Television(45,false,499,"amarillo",'B',4);		
		electrodomesticos[9] = new Television(25,false,299,"verde",'T',4);		
		
		double precioLavadoras = 0;
		double precioTelevisiones = 0;
		double preciototal = 0;
	
		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			if (electrodomesticos[i] instanceof Lavadora) {
				precioLavadoras += electrodomesticos[i].getPrecio();
			}
			
			if (electrodomesticos[i] instanceof Television) {
				precioTelevisiones += electrodomesticos[i].getPrecio();	
			}
			
			preciototal += electrodomesticos[i].getPrecio();
		}
		
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("Precio de todas las Lavadoras :"+df.format(precioLavadoras)+ "€");
		System.out.println("Precio de todas las Televisiones: "+df.format(precioTelevisiones)+ "€");
		System.out.println("Precio de todos los electrodomesticos: "+df.format(preciototal)+ "€");
		
	}

}
