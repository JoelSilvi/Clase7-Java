package tarea7;

public class Aereos extends MedioDeTransporte {
	private String tipoDeClima, tipoDeVuelo, tipoHelices;

	public Aereos() {
	}

	public Aereos(String _tipoDeClima, String _tipoDeVuelo, String _tipoHelices) {
		this.tipoDeClima = _tipoDeClima;
		this.tipoDeVuelo = _tipoDeVuelo;
		this.tipoHelices = _tipoHelices;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("el tipo de clima es : " + tipoDeClima + " el vuelo es : " + tipoDeVuelo
				+ " y el tipo de helices es: " + tipoHelices);
	}
}
