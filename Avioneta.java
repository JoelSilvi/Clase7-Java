package tarea7;

public class Avioneta extends Aereos {
	String tipoDeAlerones, tipoDeEstabilizadores, sistemaDePropulsor;

	public Avioneta() {
	}

	public Avioneta(String _tipoDeAlerones, String _tipoDeEstabilizadores, String _sistemaDePropulsor) {
		this.tipoDeAlerones = _tipoDeAlerones;
		this.tipoDeEstabilizadores = _tipoDeEstabilizadores;
		this.sistemaDePropulsor = _sistemaDePropulsor;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("el tipo de aleron es de : " + tipoDeAlerones + " los estabilizadores son: "
				+ tipoDeEstabilizadores + " y tienen un sistema propulsor de: " + sistemaDePropulsor);
	}
}
