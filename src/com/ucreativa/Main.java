/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Main {

	/**
	 * 
	 */
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		// TODO Auto-generated constructor stub
	//Instancia de Carro	
	Carro carro1 = new Carro("BMW", "Tracción trasera", 4, "Gris");
	Carro carro2 = new Carro("Audi", "Tracción trasera", 4, "Negro");
	Carro carro3 = new Carro("Minicouper", "Tracción 4 llantas", 4, "Negro con gris");
	Carro carro4 = new Carro("Toyota", "Tracción delantera", 4, "Gris raton");

	
	System.out.println("Instanacia 1");
	System.out.println(carro1.toString());
	System.out.println("==================");

	
	carro1 = null;
	System.gc();
	carro2 = new Carro("Country man", "Tracción 4 llantas", 4, "Negro");
	carro3 = null;
	carro4 = null;
	System.gc();
	
	
	//Instacia de Avion
	Avion avion1 = new Avion("COPA", "NO", 100, "Blanco");
	Avion avion2 = new Avion("United Airlines", "NO", 200, "Blanco");
	Avion avion3 = new Avion("DHL", "SI", 0, "Amarillo");
	Avion avion4 = new Avion("SouthWest", "SI", 0, "Azul");

	
	System.out.println("Instanacia 2");
	System.out.println(avion1.toString());
	System.out.println("==================");

	
	avion1 = null;
	System.gc();
	avion2 = new Avion("Aeropost", "SI", 0, "Celeste");
	avion3 = null;
	avion4 = null;
	System.gc();
	
	//Instacia de Bicicleta
	Bicicleta Bicicleta1 = new Bicicleta("Shimano", "2x12", "MTB");
	Bicicleta Bicicleta2 = new Bicicleta("Campagnolo", "1X12", "Ruta");
	Bicicleta Bicicleta3 = new Bicicleta("Scram", "3x10","MTB");
	Bicicleta Bicicleta4 = new Bicicleta("Avid", "2X8", "MTB");

	
	System.out.println("Instanacia 3");
	System.out.println(Bicicleta1.toString());
	System.out.println("==================");

	
	Bicicleta1 = null;
	System.gc();
	Bicicleta2 = new Bicicleta("Selle Italia", "1X13", "Ruta");
	Bicicleta3 = null;
	Bicicleta4 = null;
	System.gc();
	
	
	
	}

}
