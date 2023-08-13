package poo;

public class Furgoneta extends Coche { //Coche es superclase y furgoneta subclase

	private int capacidadCarga;
	
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		
		super(); //llamar al constructor de la clase padre, de la que hereda
		
		this.capacidadCarga=capacidadCarga;
		
		this.plazasExtra=plazasExtra;
		
	}
		
	public String getDatosFurgoneta() {
		
		return "La capacidad de carga es: " + capacidadCarga + " y las plazas son: "
				+ plazasExtra;
		
	}
		
}
