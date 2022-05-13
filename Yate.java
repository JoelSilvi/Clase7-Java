package tarea7;

public class Yate extends Maritimos{
	private String propulsion, tipoCasco ;
	private int motores;
	
	public Yate() {}
	
	public Yate(String _propulsion, int _motores, String _tipoCasco) {
		this.propulsion = _propulsion;
		this.motores = _motores;
		this.tipoCasco = _tipoCasco;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Su propulsión es: " + propulsion +
				" tiene: " + motores + " motores" + " y el tipo de casco es: " + tipoCasco);
	}
	
	public void medidas() {
		this.ancho = 40;
		this.largo = 120;
		this.total = this.ancho * this.largo;
		System.out.println("El Yate tiene un ancho de " + ancho + " un alto de: " + largo +
					" y su medida total es de " + total);
	}
}
