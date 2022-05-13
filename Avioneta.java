package tarea7;

public class Avioneta extends Aereos {
	private String tipoDeAlerones, tipoDeEstabilizadores, sistemaDePropulsor, vuelo;

	public Avioneta() {
	}

	public Avioneta(String _tipoDeAlerones, String _tipoDeEstabilizadores, String _sistemaDePropulsor) {
		this.tipoDeAlerones = _tipoDeAlerones;
		this.tipoDeEstabilizadores = _tipoDeEstabilizadores;
		this.sistemaDePropulsor = _sistemaDePropulsor;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("El tipo de aleron es de : " + tipoDeAlerones + " los estabilizadores son: "
				+ tipoDeEstabilizadores + " y tienen un sistema propulsor de: " + sistemaDePropulsor);
	}
	
	public void volar() {
		this.vuelo = "Santiago a Iquique";
		this.pais = "Holanda";
		System.out.println("La Avioneta viaja de: " + vuelo +
				" y fue construida en: " + pais);
		
	}
}
