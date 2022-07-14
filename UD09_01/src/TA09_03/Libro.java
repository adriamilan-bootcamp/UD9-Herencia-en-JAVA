package TA09_03;

public class Libro {
	private String ISBN;
	private String Titulo;
	private String Autor;
	private int nPaginas;
	
	public Libro(String iSBN, String titulo, String autor, int nPaginas) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
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
		ISBN = iSBN;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return Titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return Autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		Autor = autor;
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
		return "Libro [ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Numero de paginas=" + nPaginas + "]";
	}
	
	
	
}
