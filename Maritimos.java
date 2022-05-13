package tarea7;

public class Maritimos extends MedioDeTransporte {
	private String tipoEmbarcacion, tipoAncla, tipoProa;
	public Maritimos() {
	}

	public Maritimos(String _tipoEmbarcacion, String _tipoAncla, String _tipoProa) {
		this.tipoEmbarcacion = _tipoEmbarcacion;
		this.tipoAncla = _tipoAncla;
		this.tipoProa = _tipoProa;

	}

	@Override
	public void mostrarDatos() {
		System.out.println("La embarcación es: " + tipoEmbarcacion + " tiene una ancla de: " + tipoAncla
				+ " y su proa es: " + tipoProa);
	}
}
