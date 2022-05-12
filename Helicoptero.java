package tarea7;

public class Helicoptero extends Aereos {
	private String rotorAntipar, rotorTrasero, transmisor;
	
	public Helicoptero() {}
	
	public Helicoptero(String _rotorAntipar, String _rotorTrasero, String _transmisor) {
		this.rotorAntipar = _rotorAntipar;
		this.rotorTrasero = _rotorTrasero;
		this.transmisor = _transmisor;
	}
	
	
	public void mostrarDatos() {
		System.out.println("el rotor antipar es: " + rotorAntipar + 
				" el roto trasero hace que: " + rotorTrasero + " y su transmisor es: "
				+ transmisor);
	}
}
