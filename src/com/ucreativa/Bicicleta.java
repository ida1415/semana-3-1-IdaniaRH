/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Bicicleta {
	
	private String marcaComponetes;
	private String transmision;
	private String tipoBici;
		
	public String getMarcaComponetes() {
		return marcaComponetes;
	}


	public void setMarcaComponetes(String marcaComponetes) {
		this.marcaComponetes = marcaComponetes;
	}


	public String getTransmision() {
		return transmision;
	}


	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}


	public String getTipoBici() {
		return tipoBici;
	}


	public void setTipoBici(String tipoBici) {
		this.tipoBici = tipoBici;
	}

	/**
	 * 
	 */
	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}


	public Bicicleta(String marcaComponetes, String transmision, String tipoBici) {
		this.marcaComponetes = marcaComponetes;
		this.transmision = transmision;
		this.tipoBici = tipoBici;
	}
	
	public void PasarMarchas() {}
	
	public void EncenderLuces() {}
	
	public void Frenar() {}


	@Override
	public String toString() {
		return "Bicicleta [Marca de Componentes=" + marcaComponetes + ", Transmisión=" + transmision + ", Tipo de Bici="
				+ tipoBici + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("La instancia de bicicleta fue destruida. Tipo de Bici: " + this.getTipoBici() + ", Marca Componente: "  
		+ this.getMarcaComponetes() );
	}
	

}
