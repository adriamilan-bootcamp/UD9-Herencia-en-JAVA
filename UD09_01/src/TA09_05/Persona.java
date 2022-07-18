package TA09_05;

public class Persona {
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}


	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
