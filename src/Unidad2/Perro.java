package Unidad2;

public class Perro {
	// Atributos
    private String nombre;
    private String raza;

    // Constructor
    public Perro(String n) {
        nombre = n;
    }

    // Métodos
    public void setRaza(String r) {
        raza = r;
    }

    public void ladrar() {
        System.out.println("Guau, guau");
    }

    public static void main(String[] args) {
        Perro mascota = new Perro("Cupcake");
        Perro caza = new Perro("Rambo");

        mascota.setRaza("Bichon maltes");
        caza.setRaza("Boxer");

        mascota.ladrar();
        caza.ladrar();
    }
}
