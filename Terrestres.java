package tarea7;

public class Terrestres extends MedioDeTransporte {
	private String tipoVehiculo, tipoCamino, tipoManubrio;

	public Terrestres() {
	}

	public Terrestres(String _tipoVehiculo, String _tipoCamino, String _tipoManubrio) {
		this.tipoVehiculo = _tipoVehiculo;
		this.tipoCamino = _tipoCamino;
		this.tipoManubrio = _tipoManubrio;

	}

	@Override
	public void mostrarDatos() {
		System.out.println("transita en : " + tipoVehiculo + " por un camino de: " + tipoCamino
				+ " y el tipo de manubrio es: " + tipoManubrio);
	}

}
