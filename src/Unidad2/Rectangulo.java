package Unidad2;

public class Rectangulo {
	
		// Atributos
	    private double base;
	    private double altura;

	    // Constructor
	    public Rectangulo(double b, double h) {
	        base = b;
	        altura = h;
	    }

	    // Método para calcular el área
	    public double calcularArea() {
	        return base * altura;
	    }

	    // Método main (programa de prueba)
	    public static void main(String[] args) {
	        // Crear un objeto de tipo Rectangulo
	        Rectangulo miRectangulo = new Rectangulo(5, 3);

	        // Calcular y mostrar el área
	        double area = miRectangulo.calcularArea();
	        System.out.println("El área del rectángulo es: " + area);
	    }
	}
