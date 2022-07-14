package TA09_03;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1 = new Libro("18953", "Principios de Java", "ZeroDev", 666);
		Libro l2 = new Libro("18958", "Principios de PHP", "ZeroDev", 333);
	
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		if(l1.getnPaginas() > l2.getnPaginas()) {
			System.out.println(l1.getTitulo()+" tiene mas paginas");
		} else {
			System.out.println(l2.getTitulo()+" tiene mas paginas");
		}
		
	}

}
