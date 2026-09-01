package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
	private String nombre;
	private int peso;
	private String raza;
	private int edad;
	private String color;
	private boolean sexo; //true para macho, false para hembra
	private String tamaño;
	private String color_Ojos;
	private String pelaje;
	@Override
	public String toString() {
		return "GatoSimple nombre: " + nombre + "\n"+"peso: " + peso +"\n"+"raza:" + raza + "\n"+"edad: " + edad + "\n"+"color: "
				+ color + "\n"+ "sexo: " + sexo + "\n"+"tamaño: " + tamaño + "\n"+"color_ojos: " + color_Ojos + "\n"+"pelaje: " + pelaje
				;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getColor_ojos() {
		return color_Ojos;
	}
	public void setColor_ojos(String color_ojos) {
		this.color_Ojos = color_ojos;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	public void maullar() {
		System.out.println("Miauu");
	}
	public void ronronear() {
		System.out.println("prrrr");
	}
	public void comer(String comida) {
		if (comida.equalsIgnoreCase("pescado")) {
			System.out.println("Que rico ¡Gracias!");
		}
		else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
	public void pelear(GatoSimple gatoContrincante) {
		if (sexo) {
			if (gatoContrincante.isSexo()) {
				System.out.println("¡Ven aquí que te vas a enterar!");
			}
			else {
				System.out.println("No peleo contra gatitas");
			}
		}
		else {
			System.out.println("Lo siento, no me gusta pelear");
		}
	}
	public GatoSimple(String nombre, int peso, String raza, int edad, String color, boolean sexo, String tamaño,
			String color_Ojos, String pelaje) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
		this.sexo = sexo;
		this.tamaño = tamaño;
		this.color_Ojos = color_Ojos;
		this.pelaje = pelaje;
	}
}