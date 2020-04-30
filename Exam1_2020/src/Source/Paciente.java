package Source;

public  class Paciente {
	private static String  nombre ;
	private static int edad ;
	private static int temperatura ; 
	private static boolean vomito ;
	public Paciente() {
		Paciente.vomito = false;
		Paciente.nombre = "";
		Paciente.edad = 0;
		Paciente.temperatura = 0;
	}
	  
	//setters
	public void setNombre(String nombre) {
		Paciente.nombre = nombre;
	}
	public void setEdad(int edad) {
		Paciente.edad = edad;
	}
	public void setTemperatura(int temperatura) {
		Paciente.temperatura = temperatura;
	}
	public void setVomito(boolean vomito) {
		Paciente.vomito = vomito;
	}
//getters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	public boolean Vomito() {
		return vomito;
	}
	public int getTemperatura() {
		return temperatura;
	}

}
