/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Avion {

	private String nombreAerolinea;
	private String EsDeCarga;
	private int CantidadPersonas;
	private String color;
	
	public String getNombreAerolinea() {
		return nombreAerolinea;
	}


	public void setNombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}


	public String getEsDeCarga() {
		return EsDeCarga;
	}


	public void setEsDeCarga(String esDeCarga) {
		EsDeCarga = esDeCarga;
	}


	public int getCantidadPersonas() {
		return CantidadPersonas;
	}


	public void setCantidadPersonas(int cantidadPersonas) {
		CantidadPersonas = cantidadPersonas;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}	
	/**
	 * 
	 */
	public Avion() {
		// TODO Auto-generated constructor stub
	}


	public Avion(String nombreAerolinea, String esDeCarga, int cantidadPersonas, String color) {
		this.nombreAerolinea = nombreAerolinea;
		EsDeCarga = esDeCarga;
		CantidadPersonas = cantidadPersonas;
		this.color = color;
	}

	public void Despegar () {}
	
	public void Aterrizar() {}
	
	public void UtilizarRadar() {}
	
	public void ActivarParlantes() {}

	@Override
	public String toString() {
		return "Avion [Nombre Aerolinea= " + nombreAerolinea + ", Es de Carga= " + EsDeCarga + ", Cantidad Personas= "
				+ CantidadPersonas + ", Color=" + color + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("La instancia de avión fue eliminada. Marca: " + this.getNombreAerolinea() + ", Color: "  + this.getColor() );
	}

}
