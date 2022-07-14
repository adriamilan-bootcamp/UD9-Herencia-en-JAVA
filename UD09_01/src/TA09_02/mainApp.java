package TA09_02;

public class mainApp {

	public static void main(String[] args) {
		Serie lSeries[] = new Serie[5];
		
		lSeries[0] = new Serie("The Walking Dead", 3, "Creador");
		lSeries[1] = new Serie("THE SERIE", 12, "Ram");
		lSeries[2] = new Serie("lost", 7, "Diosito");
		lSeries[3] = new Serie("Dynamo", 6, "Kirito");
		lSeries[4] = new Serie("StarWars Ren's Path", 24, "Rem");
		
		Videojuego lVideojuegos[] = new Videojuego[5];
		
		lVideojuegos[0] = new Videojuego("UFC1", 40, "Lucha","EA");
		lVideojuegos[1] = new Videojuego("UFC2", 44, "Lucha","EA");
		lVideojuegos[2] = new Videojuego("UFC4", 49, "Lucha","EA");
		lVideojuegos[3] = new Videojuego("GTA4", 50, "Mundo Abierto","Rockstar");
		lVideojuegos[4] = new Videojuego("GTA5", 60, "Mundo Abierto","Rockstar");

		lSeries[0].entregar();
		lSeries[4].entregar();
		lVideojuegos[1].entregar();
		lVideojuegos[3].entregar();
		
		int entregados = entregados(lSeries, lVideojuegos);
			
		Serie serieMasTemporadas =  serieMasTemporadas(lSeries); 
		Videojuego videojuegoMasHoras = videojuegoMasHoras(lVideojuegos); 

		
		System.out.println("Series y Videojuegos entregados: "+entregados);
		
		System.out.println(serieMasTemporadas.toString()+"\n"+videojuegoMasHoras.toString());		
	}

	/**
     * Método que cuenta cuantas series i videojuegos hay entregados y devuelve los que lo estan
     * @param lSeries array de Series
     * @param lVideojuegos array de Vdeojuegos
    */
	public static int entregados(Serie lSeries[], Videojuego lVideojuegos[]) {
		
		int entregados = 0;
						
		for (int i = 0; i < lSeries.length; i++) {
			if(lSeries[i].isEntregado()) {
				entregados += 1;
				lSeries[i].devolver();
			}			
		}
		
		for (int i = 0; i < lVideojuegos.length; i++) {
			if(lVideojuegos[i].isEntregado()) {
				entregados += 1;
				lVideojuegos[i].devolver();
			}			
		}
		
		return entregados;
	}
	
	/**
     * Método que averigua que serie teine más temporadas
     * @param lSeries array de Series
     * @return devuelve la serie con más temporadas
    */
	public static Serie serieMasTemporadas (Serie lSeries[]) {
	
		Serie serieMasTemporadas = new Serie("A",0,""); 
		
		for (int i = 0; i < lSeries.length; i++) {
			if(lSeries[i].getnTemporadas() > serieMasTemporadas.getnTemporadas() ) {
				serieMasTemporadas = lSeries[i];
			}
		}
		
		return serieMasTemporadas;
	}
	
	/**
     * Método que averigua que videojuego teine más horas de juego
     * @param lVideojuegos array de videojuegos
     * @return devuelve el videojuego con más horas de juego
    */
	public static Videojuego videojuegoMasHoras (Videojuego lVideojuegos[]) {
		
		Videojuego videojuegoMasHoras = new Videojuego("",0); 
		
		for (int i = 0; i < lVideojuegos.length; i++) {
			
			if(lVideojuegos[i].getHorasEstimadas() > videojuegoMasHoras.getHorasEstimadas()) {
				videojuegoMasHoras = lVideojuegos[i];
			}
		}
		
		return videojuegoMasHoras;
	}
}
