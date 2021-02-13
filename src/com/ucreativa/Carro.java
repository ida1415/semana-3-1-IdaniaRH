/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Carro {
	
	private String marca;
	private String traccion;
	private int cantidadPuertas;
	private String color;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
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
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	@override
	public Carro(String marca, String traccion, int cantidadPuertas, String color) {
		this.marca = marca;
		this.traccion = traccion;
		this.cantidadPuertas = cantidadPuertas;
		this.color = color;
	}
	
	public String traccion(String traccion) {
		return traccion;
	}
	
	public void Mantenimiento () {}
	
	public int Marchamo() {
		return 1000*12; 
	}

	@Override
	public String toString() {
		return "Carro [Marca =" + marca + ", Tipo Traccion=" + traccion + ", Cantidad de Puertas=" + cantidadPuertas + ", Color="
				+ color + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("La instancia de carro fue borrada. Marca: " + this.getMarca() + ", Color: "  + this.getColor() );
	}
	
	

}
