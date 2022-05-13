package tarea7;

public class MedioDeTransporte {
	protected String marca, modelo, pais, color;
	protected int ancho, largo, total;
	protected double valor;

	public MedioDeTransporte() {
	}

	public MedioDeTransporte(String _marca, String _modelo, String _pais, String _color, int _ancho, int _largo,
			int _total, double _valor) {
		this.marca = _marca;
		this.modelo = _modelo;
		this.pais = _pais;
		this.color = _color;
		this.ancho = _ancho;
		this.largo = _largo;
		this.total = _total;
		this.valor = _valor;
	}

	public void mostrarDatos() {

	}

	public static void main(String[] args) {
		Terrestres tipoPropios = new Terrestres("auto", "Tierra", "Freestyle");
		System.out.println("\n*************************************************************************************");
		System.out.println("***************************************Terrestres************************************");
		System.out.println("*************************************************************************************");
		tipoPropios.mostrarDatos();
		System.out.println("*************************************************************************************");

		Automovil auto = new Automovil(2, "ABS", "Radiador");
		auto.mostrarDatos();
		auto.acelerar();
		System.out.println("*************************************************************************************");
		
		Bicicleta bici = new Bicicleta("3/32 pulgadas", "con jaula", "Trail");
		bici.mostrarDatos();
		bici.pedalear();
		
		System.out.println("\n\n*************************************************************************************");
		System.out.println("*******************************************Aéreos************************************");
		System.out.println("*************************************************************************************");
		Aereos propioAereo = new Aereos("Nublado", "Particular", "Hélices de paso fijo");
		propioAereo.mostrarDatos();		
		System.out.println("*************************************************************************************");

		Avioneta avioneta = new Avioneta("alta velocidad", "horizontales", "turbopropulsores");
		avioneta.mostrarDatos();
		avioneta.volar();
		System.out.println("*************************************************************************************");
				
		Helicoptero heli = new Helicoptero("un dispositivo auxiliar,", "alcanze una mayor estabilidad", "una emisora" );
		heli.mostrarDatos();
		heli.busqueda();
		
		System.out.println("\n\n*************************************************************************************");
		System.out.println("*****************************************Marítimos***********************************");
		System.out.println("*************************************************************************************");
		Maritimos maritimo = new Maritimos("Privada", "Tierra", "Plumb");
		maritimo.mostrarDatos();	
		System.out.println("*************************************************************************************");
		
		Barco barco = new Barco("Derecho", "Izquierdo", "30 metros");
		barco.mostrarDatos();
		barco.navegar();
		System.out.println("*************************************************************************************");
		Yate yate = new Yate("A motor", 3, "Monocasco");
		yate.mostrarDatos();
		yate.medidas();
		
		
	}
}
