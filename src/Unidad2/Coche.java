package Unidad2;

public class Coche {
	String marca;
	int año;
	
	public Coche() {
		marca="Sin marca";
		año=2000;
	}
	
	
	public Coche(String marca, int año) {
		super();
		this.marca = marca;
		this.año = año;
	}
	
	public String toString() {
		return "Coche [marca=" + marca +" , año=" + año +"]";
	}
	public static void main(String[] argst) {
		Coche coche1 = new Coche("Peugeot",2005);
		Coche coche2 = new Coche();
		
		System.out.println("Mi primer coche es :" +coche1);
		System.out.println("Mi coche es :" +coche2);
	}

}
