package tarea7;

public class Barco extends Maritimos {
	private String babor, estribor, amura, oceano;
	
	public Barco() {}
	
	public Barco(String _babor, String _stribor,  String _amuras) {
		this.babor = _babor;
		this.estribor = _stribor;	
		this.amura = _amuras;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Babor es el lado: " + babor +
				" estribor es el lado: " + estribor + " la anchura es: " + amura);
	}
	
	public void navegar() {
		this.oceano ="Océano Pacifico";
		this.valor = 40000;
		System.out.println("El barco viaja en el: " + oceano + " y tiene un valor de: " + valor);
	}
}
