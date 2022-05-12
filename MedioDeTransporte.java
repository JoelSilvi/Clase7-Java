package tarea7;

public class MedioDeTransporte {
	protected String marca, modelo, pais, color;
	protected int ancho, alto, total;
	protected boolean valor;

	public MedioDeTransporte() {
	}

	public MedioDeTransporte(String _marca, String _modelo, String _pais, String _color, int _ancho, int _alto,
			int _total, boolean _valor) {
		this.marca = _marca;
		this.modelo = _modelo;
		this.pais = _pais;
		this.color = _color;
		this.ancho = _ancho;
		this.alto = _alto;
		this.total = _total;
		this.valor = _valor;
	}

	public void mostrarDatos() {

	}

	public static void main(String[] args) {
		Terrestres tipoPropios = new Terrestres("auto", "Tierra", "Freestyle");
		tipoPropios.mostrarDatos();

		Automovil auto = new Automovil(2, "ABS", "Radiador");
		auto.mostrarDatos();

		Bicicleta bici = new Bicicleta("3/32 pulgadas", "con jaula", "Trail");
		bici.mostrarDatos();

		Aereos propioAereo = new Aereos("Nublado", "Particular", "Hélices de paso fijo");
		propioAereo.mostrarDatos();

		Avioneta avioneta = new Avioneta("alta velocidad", "horizontales", "turbopropulsores");
		avioneta.mostrarDatos();
		
		Helicoptero heli = new Helicoptero("un dispositivo auxiliar que contribuye con la propulsión,", "\nel helicóptero alcanza una mayor estabilidad mientras está en el aire,", "una emisora de radio control" );
		heli.mostrarDatos();
	}
}
