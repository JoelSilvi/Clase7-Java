package tarea7;

public class Automovil extends Terrestres {
	
	private int bolsasDeAire;
	private String frenos, refrigeracion, velocidades;
	
	public Automovil () {}
	
	public Automovil (int _bolsaDeAire, String _frenos, String _refrigeracion) {
		this.bolsasDeAire = _bolsaDeAire;
		this.frenos = _frenos;
		this.refrigeracion = _refrigeracion;
		
		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El automovil tiene " + bolsasDeAire + " bolsas de aire " +
				" adem�s cuenta con frenos " + frenos + " y tambi�n tiene "
				+ refrigeracion + " para la refrigeracion");
	}
	
	public void acelerar() {
		this.velocidades = "6 velocidades";
		this.modelo = "Tesla";
		System.out.println("El autom�vil cuenta con: " + velocidades +
				" y su modelo es: " + modelo);
	}

}
