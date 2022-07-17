package TA09_03;

public class Libro {

	/*Atributos*/
	private String ISBN;
	
	private String titulo;
	
	private String autor;
	
	private int nPaginas;
	
	/*Constructor */
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param nPaginas
	 */
	public Libro(String iSBN, String titulo, String autor, int nPaginas) {
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}

	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}


	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the nPaginas
	 */
	public int getnPaginas() {
		return nPaginas;
	}


	/**
	 * @param nPaginas the nPaginas to set
	 */
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	@Override
	public String toString() {
		return "El libro con ISBN: "+this.ISBN+" creado por: "+this.autor+"tiene: "+this.nPaginas+" paginas";
	}
		
	
}
