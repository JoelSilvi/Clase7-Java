package tarea7;

public class Bicicleta extends Terrestres{
	
	private String cadena, pedales, horquilla;
	
	public Bicicleta () {}
	
	public Bicicleta (String _cadena, String _pedales, String _horquilla) {
		this.cadena = _cadena;
		this.pedales = _pedales;
		this.horquilla = _horquilla;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("El tipo de cadena es: " + cadena + " los pedales son: " +
				pedales + " y la horquilla es de tipo: " + horquilla);
	}
	
	public void pedalear() {
		this.pedales = "pedales simples";
		this.marca = "Bianchi";
		System.out.println("Podemos usar la bici que tiene: " + pedales +
				" esa es marca " + marca);
	}
	
}
