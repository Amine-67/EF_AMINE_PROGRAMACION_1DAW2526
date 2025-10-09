package Unidad2;

public class Libro {
	
	// Atributos
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String t, String a) {
        titulo = t;
        autor = a;
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        
    	// Crear dos libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // Mostrar la información de los libros
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}

