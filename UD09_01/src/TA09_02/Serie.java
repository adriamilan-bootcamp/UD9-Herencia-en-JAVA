package TA09_02;

public class Serie {
	protected String titulo = "";
	protected int nTemporadas = 3;
	protected boolean entregado = false;
	protected String creador = "";
	
	public Serie() {
		// TODO Auto-generated constructor stub
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int nTemporadas, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.creador = creador;
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
	 * @return the nTemporadas
	 */
	public int getnTemporadas() {
		return nTemporadas;
	}

	/**
	 * @param nTemporadas the nTemporadas to set
	 */
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", Numero de temporadas=" + nTemporadas + ", entregado=" + entregado + ", creador="
				+ creador + "]";
	}
	
	

}
