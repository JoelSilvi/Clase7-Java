package tarea7;

public class Helicoptero extends Aereos {
	private String rotorAntipar, rotorTrasero, transmisor, lugar;
	
	public Helicoptero() {}
	
	public Helicoptero(String _rotorAntipar, String _rotorTrasero, String _transmisor) {
		this.rotorAntipar = _rotorAntipar;
		this.rotorTrasero = _rotorTrasero;
		this.transmisor = _transmisor;
	}
	
	
	public void mostrarDatos() {
		System.out.println("El rotor antipar es: " + rotorAntipar + 
				" El roto trasero hace que: " + rotorTrasero + " y su transmisor es: "
				+ transmisor);
	}
	
	public void busqueda() {
		this.lugar = "La Serena";
		this.color = "Rojo";
		System.out.println("El helicoptero de color " + color +
				" está realizando una búsqueda en la: " + lugar);
	}
}
